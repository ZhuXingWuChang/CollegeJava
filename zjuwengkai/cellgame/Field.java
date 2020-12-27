package zjuwengkai.cellgame;

import java.util.ArrayList;

/*
Field类里面有一个Cell的二维数组，它只负责管理这个数组
需要place，那么就放进去；需要get，那么就拿出来给你
Field是一个容器，它负责管理所有的Cell，并且判断Cell之间的关系（邻居是否活着）
Field自身不知道View的存在，因为Field对外提供的就是自己的数据接口，而谁使用了它的接口，它一无所知
 */
public class Field {
    private int width;
    private int height;
    private Cell[][] field;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        field = new Cell[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    //place:放置
    public Cell place(int row, int col, Cell o) {
        Cell ret = field[row][col];
        field[row][col] = o;
        return ret;
    }

    //getCell:得到
    public Cell getCell(int row, int col) {
        return field[row][col];
    }

    //获得周围的邻居的情况(是否活着)
    //获得参数是当前所在的行和列
    public Cell[] getNeighbour(int row, int col) {
        ArrayList<Cell> list = new ArrayList<Cell>();
        //对所在的整个九宫格进行遍历
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                int r = row + i;//r是九宫格所对应的三个行标
                int c = col + j;//c是九宫格所对应的三个列标
                //只要r和c在合理的范围之内，并且不是Cell自身，那么就把field[][]给add到list里面去
                if (r > -1 && r < height && c > -1 && c < width && !(r == row && c == col)) {
                    list.add(field[r][c]);//field[][]就是一个Cell
                }
            }
        }
        //toArray会把list集合里面的所有东西转换成数组
        //只需要在转换的时候将需要的类型当成参数传入，java工具即可给我们返回我们想要的类型
        //所以这里实际上是将ArrayList<Cell>转换成了一个Cell[]，并且返回
        return list.toArray(new Cell[list.size()]);
    }

}
