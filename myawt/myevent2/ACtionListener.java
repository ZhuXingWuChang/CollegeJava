package myawt.myevent2;

import java.awt.*;
import javax.swing.*;

public class ACtionListener {
	public static void main(String[] args) {
		JFrame frame = new JFrame ("ActionEvent Demo");
		JButton b = new JButton("Press me");
		
		//注册事件监听程序
		b.addActionListener(new ButtonHandler());
		
		frame.getContentPane().add(b, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}

}
