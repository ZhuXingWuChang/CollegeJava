package myawt.myevent2;

import java.awt.event.*;

public class ButtonHandler implements ActionListener {
	
	//出现ActionEvent事件时，下面方法将被调用
	public void actionPerformed(ActionEvent e) {
		System.out.println("Action occurred");
	}
}
