package themetwo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

//窗体类，负责给其它类一个表演的舞台
public class FrameGame extends JFrame {
	/**
	 * @date 2020 12 15
	 * @author 诸行无常
	 */
	private static final long serialVersionUID = 20201215;

	private Container contentPane = this.getContentPane();
	private JPanel buttonPane = new JPanel();
	private JButton startGame = new JButton("开始！");
	private JTextField setHorse = new JTextField("输入马的数量后按回车");
	private JTextField setTime = new JTextField("输入时间(秒)后按回车");
	private Graphics g;// 图像类，DrawHorse类是有实例的，每个实例都有自己对应的图像
	private DrawHorse dh = new DrawHorse();// 一个画马线程
	private RunHorse rh = new RunHorse();// 一个跑马线程

	private static FrameGame fg = new FrameGame();
	private static ArrayList<Horse> list = new ArrayList<Horse>();// 用来存放马

	// 这个窗体类只有一个方法，那就是把自己给展示出来
	public void showUI() {
		this.setTitle("赛马游戏！");
		this.setSize(1280, 690);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 窗体底部的按钮区域
		buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.X_AXIS));
		// 为startGame按钮注册事件处理机制
		startGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (1 == e.getClickCount()) {
					// 传三个参数
					// 其中fg和g从FrameGame -> DrawHorse -> Horse
					// list从FrameGame -> DrawHorse
					dh.setGraphics(fg.g, fg, list);
					dh.start();
					// RunHorse中的list是来自DrawHorse中的，所以必须等dh执行完才能启动RunHorse
					rh.setList(list);
					rh.start();
				}
			}
		});
		// 为setHorse文本框注册事件处理机制
		setHorse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = Integer.parseInt(setHorse.getText()) - 1;
				dh.setHorseNumber(i);
			}
		});
		// 为setTime文本框注册事件处理机制
		setTime.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int t = Integer.parseInt(setTime.getText()) * 100;
				rh.setMaxTime(t);
			}
		});

		buttonPane.add(startGame);
		buttonPane.add(setHorse);
		buttonPane.add(setTime);

		contentPane.add(buttonPane, BorderLayout.SOUTH);
		this.setVisible(true);
		g = this.getGraphics();
	}

	public static void main(String[] args) {
		fg.showUI();
	}
}
