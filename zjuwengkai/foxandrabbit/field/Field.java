package zjuwengkai.foxandrabbit.field;

import java.util.ArrayList;

import zjuwengkai.foxandrabbit.animal.*;
import zjuwengkai.foxandrabbit.cell.*;
import zjuwengkai.foxandrabbit.foxnrabbit.*;

public class Field {
    private static final Location[] adjacent = {
            new Location(-1, -1), new Location(-1, 0), new Location(-1, 1),
            new Location(0, -1), new Location(0, 0), new Location(0, 1),
            new Location(1, -1), new Location(1, 0), new Location(1, 1)
    };
    private int width;
    private int height;
    private Cell[][] field;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        filed = new Cell[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Cell place(int row, int col, Cell o) {
        Cell ret = field[row][col];
        field[row][col] = o;
        return ret;
    }

    public Cell getCell(int row, int col) {
        return field[row][col];
    }

    public Cell[] getNeighbour(int row, int col) {
        ArrayList<Cell> list = new ArrayList<Cell>();
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {

            }
        }
    }
}