package zjuwengkai.foxandrabbit.foxnrabbit;

import zjuwengkai.foxandrabbit.animal.*;
import zjuwengkai.foxandrabbit.cell.*;
import zjuwengkai.foxandrabbit.field.*;

import javax.swing.*;

public class FoxAndRabbit {
    private Field theFiled;
    private View theView;

    public FoxAndRabbit(int size) {
        theFiled = new Field(size, size);
        for (int row = 0; row < theFiled.getHeight(); row++) {
            for (int col = 0; col < theFiled.getWidth(); col++) {
                double probability = Math.random();
                if (probability < 0.05) {
                    theFiled.place(row, col, new Fox());
                } else if (probability < 0.15) {
                    theFiled.place(row, col, new Rabbit());
                }
            }
        }
        theView = new View(theFiled);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Cells");
        frame.add(View);
        frame.pack();
        frame.setVisible(true);
    }

    public void start(int steps) {
        for (int i = 0; i < steps; i++) {
            step();
            theView.repaint();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void step(){
        for(int row=0;row<theField.getHeight();row++){
            for(int col=0;col<theField.getWidth();col++){
                Cell cell = theField.getCell(row,col);
                if(cell != null){
                    Animal animal = (Animal)cell;
                    animal.grow();
                    if(animal.isAlive){
                        //  move
                        Location loc = animal.move(theField.getFreeNeighbour())
                    }
                }
            }
        }
    }
}
