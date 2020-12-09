package myawt;

import java.awt.*;
import javax.swing.*;

public class JFrameDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("JFrameDemo");
		//创建一个JFrame（框架）实例
		JButton button = new JButton("Press me");
		//创建一个JButton（按钮）实例
		
		//将JButton放到JFrame中央
		frame.getContentPane().add(button, BorderLayout.CENTER);
		//从框架中得到一个“内容面板”实例，并向其中添加一个按钮实例，位于中央
		
		frame.pack();
		frame.setVisible(true);
	}
}