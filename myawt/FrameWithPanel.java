package myawt;

import java.awt.*;
import javax.swing.*;

public class FrameWithPanel {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Frame with Panel");
		Container contentPane = frame.getContentPane();
		//从框架中获得容器（这个容器是背景）
		contentPane.setBackground(Color.CYAN);
		//将框架实例的背景设置被蓝绿色
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.yellow);
		//将面板实例的背景设置为黄色
		
		JButton button = new JButton("Press me");
		panel.add(button);
		
		//将面版实例添加到框架的南侧
		contentPane.add(panel, BorderLayout.SOUTH);
		frame.setSize(300,200);
		frame.setVisible(true);
	}
}
