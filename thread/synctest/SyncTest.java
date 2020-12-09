package thread.synctest;

public class SyncTest {
	public static void main(String[] args) {
		SyncStack stack = new SyncStack();//sync:同步
		Runnable source = new Producer(stack);//producer:生产者
		Runnable sink = new Consumer(stack);//consumer:消费者
		
		Thread t1 = new Thread(source);//创建线程
		Thread t2 = new Thread(sink);//创建线程
		t1.start();
		t2.start();
	}
}