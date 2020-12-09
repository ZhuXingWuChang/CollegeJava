package myawt;

import java.awt.*;

import javax.swing.*;

public class JFrameDemo2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("JFrameDemo2");
		//创建一个框架实例
		JButton button = new JButton("Press me");
		//创建一个按钮实例
		JPanel contentPane = new JPanel();
		//创建一个面板实例
		
		//为面板设置BorderLayout（边界布局）布局管理器
		contentPane.setLayout(new BorderLayout());
		
		//将按钮放到面板的中央
		contentPane.add(button, BorderLayout.CENTER);
		
		//为框架设置面板
		frame.setContentPane(contentPane);
		
		frame.pack();//将框架设置为合适的大小
		frame.setVisible(true);//显示框架
	}
}
