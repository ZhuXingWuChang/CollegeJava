package zjuwengkai.cellgame;

import java.awt.*;
/*
而相比于Field，Cell所实现的业务逻辑则要简单的多
它只知道自己的状态，并且知道自己能够画出来，而并不知道自己的周围有邻居的存在
并且Cell也不知道Field的存在，Cell只包装了自己的数据，知道自己能画出来
并对外提供接口，而不知道谁使用了这些接口
 */
public class Cell {
    private boolean alive = false;

    public void die() {
        alive = false;
    }

    public void reborn() {
        alive = true;
    }

    public boolean isAlive() {
        return alive;
    }

    //画的时候

    public void draw(Graphics g, int x, int y, int size) {
        g.drawRect(x, y, size, size);//先画个方框
        if (alive) {//如果是活着的
            g.fillRect(x, y, size, size);//那么方框需要填起来
        }
    }

}
