package myawt.myevent2;

import java.awt.*;
import java.awt.event.*;

public class MouseClickHandler extends MouseAdapter {
	// 只关心对单击鼠标事件的处理，因此在这里继承
	// MouseAdapter，以避免编写其他不需要的事件处理方法
	public void mouseClicked(MouseEvent e) {
		// 进行有关的处理
	}
}
