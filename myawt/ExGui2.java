package myawt;

import javax.swing.*;

public class ExGui2 {
	private JFrame frame;
	private JButton b1;
	private JButton b2;
	
	public static void main(String[] args) {
		ExGui2 that = new ExGui2();
		that.go();
	}

	public void go() {
		frame = new JFrame("GUI example2");
		JPanel contentPane = new JPanel();
		
		b1 = new JButton("Press me");
		b2 = new JButton("Don't press me");
		
		contentPane.add(b1);
		contentPane.add(b2);
		
		frame.setContentPane(contentPane);    
		
		frame.pack();
		frame.setVisible(true);
	}
}
