package myawt.myevent2;

import javax.swing.*;
import java.awt.event.*;

public class MyButton extends JButton implements ActionListener {
	public MyButton(String text) {
		super(text);
		
		//注册事件的监听程序
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
