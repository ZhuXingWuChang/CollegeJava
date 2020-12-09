package myawt.myevent;

public class MouseClient {
	public static void main(String[] args) {
		ConcreteMouseListener listener = new ConcreteMouseListener();
		Button button = new Button();
		button.addMouseListener(listener);
		button.doClick();
	}
}
