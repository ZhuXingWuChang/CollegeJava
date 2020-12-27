package zjuwengkai.cellgame;

import java.awt.*;
import javax.swing.*;

/*
View做的事情也非常简单，就是paint（将整个Field画出来）
如果它需要画，那么它就直接去问Field要数据，而不用关心数据内部的逻辑是怎样的，它只需要一个结果
并且View自身不管数据，数据在哪跟View没关系
View只负责画的时候，把数据全部拿过来，然后重新画一遍，至于从谁那里拿到的数据，和他无关
 */
public class View extends JPanel {
    public static final int GRID_SIZE = 16;
    private Field theField;

    public View(Field field) {
        theField = field;
    }

    //每当我的“窗口”要被显示出来的时候，调用paint方法
    @Override
    public void paint(Graphics g) {

        super.paint(g);
        //去遍历每一个格子，如果这个格子里面是有细胞的，那么画出来
        //而cell的数据由cell自己管理，view只需要知道，如果这里不是空的，那么画就行了
        for (int row = 0; row < theField.getHeight(); row++) {
            for (int col = 0; col < theField.getWidth(); col++) {
                Cell cell = theField.getCell(row, col);
                if (cell != null) {
                    //调用cell的draw方法，而不关心方法具体的实现
                    cell.draw(g, col * GRID_SIZE, row * GRID_SIZE, GRID_SIZE);
                }
            }
        }

    }

}
