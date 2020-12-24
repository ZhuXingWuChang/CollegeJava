package themetwo;

import java.util.ArrayList;

public class RunHorse extends Thread {
	private int t = 0;// 时间t
	// 用于存放马，这个list从DrawHorse得到
	private ArrayList<Horse> list;
	// 由于每隔0.01秒刷新一次，所以这里的maxTime的单位就是0.01秒
	private static int maxTime = 0;

	public void setList(ArrayList<Horse> list) {
		this.list = list;
	}

	public void setMaxTime(int maxTime) {
		RunHorse.maxTime = maxTime;
	}

	public void run() {
		// 等0.5秒，这时候所有的马应该已经画好了，然后开始跑
		try {
			sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while (t++ < maxTime) {
			for (int i = 0; i < list.size(); i++) {
				list.get(i).running();
				try {
					sleep(10);// 每0.01秒刷新一次位置
				} catch (Exception e) {
				}
			}
		}
	}
}
