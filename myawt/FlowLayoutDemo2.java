package myawt;

import javax.swing.*;

public class FlowLayoutDemo2 {
	private JFrame frame;
	private JPanel contentPane;
	private JButton button1, button2, button3;

	public static void main(String[] args) {
		FlowLayoutDemo2 that = new FlowLayoutDemo2();
		that.go();
	}

	public void go() {
		frame = new JFrame("Flow Layout2");
		contentPane = new JPanel();
		

		button1 = new JButton("Ok");
		button2 = new JButton("Open");
		button3 = new JButton("Close");

		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(button3);
		
		frame.setContentPane(contentPane);
		frame.setSize(200,100);
		frame.setVisible(true);
	}
}
