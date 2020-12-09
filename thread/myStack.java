package thread;

public class myStack extends Thread {
	int idx = 0;
	char[] data = new char[6];
	
	public void push(char c) {
		synchronized (this) {
			//当线程执行到被同步的语句时，它将传递的对象参数设为锁定标志，禁止其他线程对该对象的访问
			data[idx] = c;
			idx++;
		}
	}
	
	public char pop() {
		synchronized (this) {
			//同上
			idx--;
			return data[idx];
		}
	}
}
