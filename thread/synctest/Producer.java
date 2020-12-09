package thread.synctest;

public class Producer implements Runnable {
	SyncStack theStack;
	
	public Producer(SyncStack s) {
		theStack = s;
	}
	
	public void run() {
		char c;
		for (int i=0; i<20; i++) {
			c = (char)(Math.random()*26 + 'A');//A到Z
			theStack.push(c);
			System.out.println("Produced: " + c);
			try {
				Thread.sleep( (int)(Math.random()*100) );
			} catch (InterruptedException e) {}
		}
	}
}
