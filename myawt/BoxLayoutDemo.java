package myawt;

import java.awt.*;
import javax.swing.*;

public class BoxLayoutDemo {
	private JFrame frame;
	private JPanel pv, ph;
	
	public static void main(String[] args) {
		BoxLayoutDemo that = new BoxLayoutDemo();
		that.go();
	}

	public void go() {
		frame = new JFrame("Box Layout example");
		Container contentPane = frame.getContentPane();
		
		pv = new JPanel();
		//将pv的布局管理器设置为垂直方向的BoxLayout
		pv.setLayout(new BoxLayout(pv, BoxLayout.Y_AXIS));
		
		//为pv添加标签label
		pv.add(new JLabel(" Monday"));
		pv.add(new JLabel(" Tuesday"));
		pv.add(new JLabel(" Wednesday"));
		pv.add(new JLabel(" Thursday"));
		pv.add(new JLabel(" Friday"));
		pv.add(new JLabel(" Saturday"));
		pv.add(new JLabel(" Sunday"));
		
		//将pv添加到内容窗格的中部
		contentPane.add(pv, BorderLayout.CENTER);
		
		ph = new JPanel();
		//将ph的布局管理器设置为水平方向的BoxLayout
		ph.setLayout(new BoxLayout(ph, BoxLayout.X_AXIS));
		
		//为ph添加按钮
		ph.add(new JButton("Yes"));
		ph.add(new JButton("No"));
		ph.add(new JButton("Cancel"));
		
		//将ph添加到内容窗格的南部
		contentPane.add(ph, BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);
	}
}
