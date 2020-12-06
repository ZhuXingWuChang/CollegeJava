package Thread.SyncTest;

public class SyncStack {
	private int index = 0;
	private char buffer[] = new char[6];
	
	public synchronized void push(char c) {//同步方法加锁
		while(index >= buffer.length) {//防止越界
			try {
				this.wait();
			} catch (InterruptedException e) {}
		}
		this.notify();
		buffer[index] = c;
		index++;
	}
	
	public synchronized char pop() {//同步方法加锁
		while(index >= 0) {//防止越界
			try {
				this.wait();
			} catch (InterruptedException e) {}
		}
		this.notify();
		index--;
		return buffer[index];
	}
}
