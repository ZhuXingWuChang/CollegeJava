package zjuwengkai.cellgame;
/*
这是一个细胞自动机游戏，游戏规则如下：
死亡：如果活着的邻居数量<2或>3，则死亡
新生：如果正好有3个邻居活着，则新生
其他情况则保持原状
 */

import javax.swing.*;
/*
CellMachine最终实现的是业务逻辑，它通过自己的main实现业务逻辑
它只负责把Field（数据）和View（显示）连接在一起，而这个类本身并不代表任何的东西
CellMachine从Field那里拿到所有的数据，然后让View重新画一遍
==========================
在这里，View和Field的关系，就是表现与数据的关系
View只管根据Field画出图形
Field只管数据的存放
一旦数据更新以后，通知View重新画出整个画面
不去精心设计哪个局部需要更新
这样简化了程序逻辑
是在计算机运算速度提高的基础上实现的
==========================
 */
public class CellMachine {

    public static void main(String[] args) {

        //准备数据,我们有数据了

        //field(场、区域),这里构造一个30×30的区域
        Field field = new Field(30, 30);
        //遍历field，在field里面放满cell（这些cell都是死的）
        for (int row = 0; row < field.getHeight(); row++) {
            for (int col = 0; col < field.getWidth(); col++) {
                field.place(row, col, new Cell());//place:放置
            }
        }
        //遍历field，让每个cell得到filed的行和列，并且让1/5的cell重生
        for (int row = 0; row < field.getHeight(); row++) {
            for (int col = 0; col < field.getWidth(); col++) {
                Cell cell = field.getCell(row, col);//从field中get一个Cell
                if (Math.random() < 0.2) {//有1/5的细胞会
                    cell.reborn();//reborn(再生)
                }
            }
        }

        //设置窗口,用来显示

        View view = new View(field);//view:观察
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Cells");
        frame.add(view);
        frame.setSize(View.GRID_SIZE * (field.getWidth() + 1),
                View.GRID_SIZE * (field.getHeight() + 1) + 24);
        frame.setVisible(true);

        //跑1000步
        for (int i = 0; i < 1000; i++) {
            //遍历field
            for (int row = 0; row < field.getHeight(); row++) {
                for (int col = 0; col < field.getWidth(); col++) {
                    Cell cell = field.getCell(row, col);//从field中get一个Cell
                    Cell[] neighbour = field.getNeighbour(row, col);//neighbour:邻居
                    int numOflive = 0;
                    for (Cell c : neighbour) {//遍历所有的邻居
                        if (c.isAlive()) {//如果某一个邻居是活着的
                            numOflive++;//那么邻居的数量要增加
                        }
                    }
                    System.out.print("[" + row + "][" + col + "]:");
                    System.out.print(cell.isAlive() ? "live" : "dead");
                    System.out.print(":" + numOflive + "-->");
                    if (cell.isAlive()) {//如果是活着的，那么周围的邻居数不是2或3，就要死掉
                        if (numOflive < 2 || numOflive > 3) {
                            cell.die();
                            System.out.print("die");
                        }
                    } else if (3 == numOflive) {//如果是死掉的，周围的邻居数为3，就要重生
                        cell.reborn();
                        System.out.print("reborn");
                    }
                    System.out.println();
                }
            }
            //一个遍历下来以后，整个field里面的数据被完全更新了一遍
            //遍历完整个field之后，repaint，而不是说每死一个就重新画一个，而是等整个数据都更新完毕之后，再repaint
            System.out.println("UPDATE");
            frame.repaint();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
