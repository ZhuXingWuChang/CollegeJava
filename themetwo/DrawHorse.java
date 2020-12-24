package themetwo;

import java.awt.*;
import java.util.ArrayList;

public class DrawHorse extends Thread {
	private static int horseNumber;
	private ArrayList<Horse> list = new ArrayList<Horse>();
	private Graphics g;// 每个Horse类的实例，知道自己是一个图像
	private FrameGame fg;// 每个Horse类的实例，知道自己应该在哪个窗口里

	public void setHorseNumber(int horseNumber) {
		DrawHorse.horseNumber = horseNumber;
	}

	public void setGraphics(Graphics g, FrameGame fg, ArrayList<Horse> list) {
		this.g = g;
		this.fg = fg;
		this.list = list;
	}

	public void run() {
		while (list.size() <= horseNumber) {
			Horse horse = new Horse();
			horse.setGraphics(g, fg);
			list.add(horse);
		}
	}
	
}
