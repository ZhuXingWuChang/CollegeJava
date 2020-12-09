package myawt;

import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo {
	private JFrame frame;
	private JButton b1, b2, b3, b4, b5, b6;
	
	public static void main(String[] args) {
		GridLayoutDemo that = new GridLayoutDemo();
		that.go();
	}

	void go() {
		frame = new JFrame("Grid example");
		Container contentPane = frame.getContentPane();
		
		//为内容窗格设置3行2列的GridLayout（网格布局）布局管理器
		contentPane.setLayout(new GridLayout(3,2));
		
		b1 = new JButton("grid_1");
		b2 = new JButton("grid_2");
		b3 = new JButton("grid_3");
		b4 = new JButton("grid_4");
		b5 = new JButton("grid_5");
		b6 = new JButton("grid_6");
		
		//添加按钮
		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);
		contentPane.add(b4);
		contentPane.add(b5);
		contentPane.add(b6);
		
		frame.pack();
		frame.setVisible(true);
	}
}
