package myawt;

import java.awt.*;
import javax.swing.*;

public class ExGui {
	private JFrame frame;
	private JButton b1;
	private JButton b2;
	
	public static void main(String[] args) {
		ExGui that = new ExGui();
		that.go();
	}

	public void go() {
		frame = new JFrame("GUI example");
		Container contentPane = frame.getContentPane();
		
		//为内容窗格设置FlowLayout（流动边界）布局管理器
		contentPane.setLayout(new FlowLayout());
		
		b1 = new JButton("Press me");
		b2 = new JButton("Don't press Me");
		
		contentPane.add(b1);
		contentPane.add(b2);
		
		frame.pack();
		frame.setVisible(true);
	}
}
