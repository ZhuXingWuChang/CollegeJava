package Thread;

class Lefthand extends Thread {
	public void run() {
		for(int i = 0;i <= 5;i++) {
			System.out.println("You are Students!");
			try {
				sleep(500);
			} catch (InterruptedException e) {}
			//sleep()和wait()让线程进入blocked状态
		}
	}
}
class Righthand extends Thread {
	public void run() {
		for(int i = 0;i<= 5;i++) {
			System.out.println("I am a Teacher!");
			try {
				sleep(300);
			} catch (InterruptedException e) {}
			//处于blocked状态的线程被中断会抛出Interrupted异常
		}
	}
}
public class ThreadTest {
	static Lefthand left;
	static Righthand right;
	//两个静态引用，用来引用线程
	public static void main(String[] args) {
		left = new Lefthand();
		//创建一个线程
		right = new Righthand();
		//创建一个线程
		left.start();
		//把线程放入队列
		right.start();
		//把线程放入队列0
	}
}