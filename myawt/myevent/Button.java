package myawt.myevent;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Button {
	private MouseListener mouseListener;

	public void addMouseListener(MouseListener l) {
		mouseListener = l;
	}

	public void doClick() {
		/*
		 * 这里的new Component() {} 就是 event.getSource() 得到的事件源 source
		 */
		MouseEvent event = new MouseEvent(new Component() {}, 1, 1, 1, 2, 3, 4, false);
		//event.getSource();
		this.mouseListener.mouseClicked(event);
	}
}
