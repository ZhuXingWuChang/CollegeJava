package themetwo;

import java.awt.*;
import java.util.Random;

public class Horse {
	private int x = 20;// 让马左右移动
	private int y = 35;// 让马上下移动
	private int v = 0;// 速度
	private Random ran = new Random();
	private Color color = new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256));
	private int location = 1;// 当前所在的赛道位置
	private Graphics g;// 每个Horse类的实例，知道自己是一个图像
	private FrameGame fg;// 每个Horse类的实例，知道自己应该在哪个窗口里

	// 西边赛道，location为1
	final static int WESTTRACK = 1;
	// 南边赛道，location为2
	final static int SOUTHTRACK = 2;
	// 东边赛道，location为3
	final static int EASTTRACK = 3;
	// 北边赛道，location为4
	final static int NORTHTRACK = 4;

	public void setGraphics(Graphics g, FrameGame fg) {
		this.g = g;
		this.fg = fg;
	}

	public void running() {// 表示马的运动，绕赛道跑，必须放在循环中才能跑起来
		v = (int) (30 * Math.random() + 1);// 每个时刻的速度都不一样
		// 逆时针跑
		if (this.isRunToTheSouth()) {
			y += v;
			g.setColor(fg.getContentPane().getBackground());// 获取背景颜色
			g.fillOval(x, y - v, 20, 20);// 用背景色覆盖住小球的上一时刻的位置
			g.setColor(this.color);
			g.fillOval(x, y, 20, 20);
		} else if (this.isRunToTheEast()) {
			x += v;
			g.setColor(fg.getContentPane().getBackground());
			g.fillOval(x - v, y, 20, 20);
			g.setColor(this.color);
			g.fillOval(x, y, 20, 20);
		} else if (this.isRunToTheNorth()) {
			y -= v;
			g.setColor(fg.getContentPane().getBackground());
			g.fillOval(x, y + v, 20, 20);
			g.setColor(this.color);
			g.fillOval(x, y, 20, 20);
		} else if (this.isRunToTheWest()) {
			x -= v;
			g.setColor(fg.getContentPane().getBackground());
			g.fillOval(x + v, y, 20, 20);
			g.setColor(this.color);
			g.fillOval(x, y, 20, 20);
		}
	}

	private boolean isRunToTheSouth() {
		// 从左上角出发
		if (35 <= y && y < 565 && 15 <= x && x <= 45 && WESTTRACK == location) {
			return true;
		} else {
			location = SOUTHTRACK;// 接下来要去南边赛道
			return false;
		}
	}

	private boolean isRunToTheEast() {
		// 到达左下角
		if (565 <= y && y <= 595 && 15 <= x && x < 1145 && SOUTHTRACK == location) {
			return true;
		} else {
			location = EASTTRACK;// 接下来要去东边赛道
			return false;
		}
	}

	private boolean isRunToTheNorth() {
		// 到达右下角
		if (65 < y && y <= 595 && 1145 <= x && x <= 1175 && EASTTRACK == location) {
			return true;
		} else {
			location = NORTHTRACK;// 接下来要去北边赛道
			return false;
		}
	}

	private boolean isRunToTheWest() {
		// 到达右上角
		if (35 <= y && y <= 65 && 45 < x && x <= 1175 && NORTHTRACK == location) {
			return true;
		} else {
			location = WESTTRACK;// 接下来要去西边赛道
			return false;
		}
	}
}
