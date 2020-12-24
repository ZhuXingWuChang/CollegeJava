package themefive;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FrontEnd {
	BackEnd atm = new BackEnd();
	private boolean canRW = false;
	private JFrame frame = new JFrame("A T M 机");
	private JButton withdrawal = new JButton("取款(单位:百元)");
	private JButton deposit = new JButton("存款(单位:百元)");
	private JButton modifyPassword = new JButton("修改密码");
	private JLabel nameLabel = new JLabel("卡号", JLabel.RIGHT);
	private JLabel pwLabel = new JLabel("密码", JLabel.RIGHT);
	private JTextField nameField = new JTextField(atm.getUsername());
	private JTextField withdrawalField = new JTextField("0");
	private JTextField depositField = new JTextField("0");
	private JPasswordField pwField = new JPasswordField(atm.getPassword());
	private JPasswordField mpwField = new JPasswordField();
	private JTextArea ta = new JTextArea(30, 20);

	public void go() {
		nameField.setForeground(Color.red);
		// 给nameField注册监听器
		nameField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un = nameField.getText();// 获取事件源——文本域的内容，事件——文本域中有内容
				if (!(atm.getUsername().equals(un))) {
					ta.append("*[error:该账户不存在！]*\n");// 事件处理器——进行比对
				}
			}
		});
		// 给pwField注册监听器
		pwField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] get = pwField.getPassword();// 获取事件源——文本域的内容，事件——文本域中有内容
				String pw = new String(get);// 事件处理器——进行比对
				if (!(atm.getPassword().equals(pw))) {
					ta.append("*[error:密码错误！]*\n");
				} else {
					ta.append("*[密码正确，已成功登入帐户。]*\n");
					canRW = true;
				}
			}
		});
		// 给withdrawal注册监听器
		withdrawal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (canRW) {
					Integer minus = new Integer(withdrawalField.getText());
					try {
						atm.withdrawal(minus);
						ta.append("*[取款" + minus * 100 + "元。]*\n*[当前金额" + atm.getBalance() + "元。]*\n");
					} catch (DWException | NoBalanceException e1) {
						ta.append("*[error:取款失败！]*\n");
					}
				} else {
					ta.append("*[error:无操作权限！]*\n");
				}
			}
		});
		// 给deposit注册监听器
		deposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (canRW) {
					Integer plus = new Integer(depositField.getText());
					try {
						atm.deposit(plus);
						ta.append("*[存款" + plus * 100 + "元。]*\n*[当前金额" + atm.getBalance() + "元。]*\n");
					} catch (DWException e1) {
						ta.append("*[error:存款失败！]*\n");
					}
				} else {
					ta.append("*[error:无操作权限！]*\n");
				}
			}
		});
		// 给modifyPassword注册监听器
		modifyPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (canRW) {
					String newpw = mpwField.getText();
					if (atm.modifyPassword(atm.getPassword(), newpw)) {
						ta.append("*[修改密码成功！]*\n");
					} else {
						ta.append("*[error:修改密码失败！]*\n");
					}
				} else {
					ta.append("*[error:无操作权限！]*\\n");
				}
			}
		});

		JPanel rightPane = new JPanel();
		rightPane.setLayout(new GridLayout(5, 1));
		rightPane.add(nameField);
		rightPane.add(pwField);
		rightPane.add(withdrawalField);
		rightPane.add(depositField);
		rightPane.add(mpwField);

		JPanel leftPane = new JPanel();
		leftPane.setLayout(new GridLayout(5, 1));
		leftPane.add(nameLabel);
		leftPane.add(pwLabel);
		leftPane.add(withdrawal);
		leftPane.add(deposit);
		leftPane.add(modifyPassword);

		JPanel northPane = new JPanel();
		northPane.add(leftPane);
		northPane.add(rightPane);

		JScrollPane jsp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, // 根据需要设置垂直滚动条
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); // 根据需要设置水平滚动条

		Container cp = frame.getContentPane();
		cp.add(northPane, BorderLayout.NORTH);
		cp.add(jsp, BorderLayout.CENTER);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		FrontEnd fe = new FrontEnd();
		fe.go();
	}

}
