package myawt;

import java.awt.*;
import javax.swing.*;

public class BoxDemo {
	private JFrame frame;
	private Box bv, bh;

	public static void main(String[] args) {
		BoxDemo that = new BoxDemo();
		that.go();
	}

	public void go() {
		frame = new JFrame("Box Layout example");
		Container contentPane = frame.getContentPane();

		//创建使用垂直方向BoxLayout的Box实例
		bv = Box.createVerticalBox();

		// 为pv添加标签label
		bv.add(new JLabel(" Monday"));
		bv.add(new JLabel(" Tuesday"));
		bv.add(new JLabel(" Wednesday"));
		bv.add(new JLabel(" Thursday"));
		bv.add(new JLabel(" Friday"));
		bv.add(new JLabel(" Saturday"));
		bv.add(new JLabel(" Sunday"));

		// 将bv添加到内容窗格的中部
		contentPane.add(bv, BorderLayout.CENTER);

		// 创建使用水平方向的BoxLayout的Box实例
		bh = Box.createHorizontalBox();
		bh.add(new JButton("Yes"));
		bh.add(new JButton("No"));
		bh.add(new JButton("Cancel"));

		// 将bh添加到内容窗格的南部
		contentPane.add(bh, BorderLayout.SOUTH);

		frame.pack();
		frame.setVisible(true);
	}
}
