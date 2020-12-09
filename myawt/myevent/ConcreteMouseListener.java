package myawt.myevent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ConcreteMouseListener implements MouseListener {

	public ConcreteMouseListener() {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.printf("我被{%s}点了一下，MD痒死了~~", e.getSource().toString());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

}
