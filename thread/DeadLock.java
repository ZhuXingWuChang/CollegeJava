package thread;

class classA {
	public classB b;
	
	synchronized void methoda() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered classA.methoda.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println(name + " trying to call classB.methodb()");
		b.methodb();
	}
	
	synchronized void methodb() {
		System.out.println(" inside classA.methodb() ");
	}
}

class classB {
	public classA a;
	
	synchronized void methoda() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered classB.methoda.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println(name + " trying to call classA.methodb()");
		a.methodb();
	}
	
	synchronized void methodb() {
		System.out.println(" inside classB.methodb() ");
	}
}

public class DeadLock extends Thread {
	classA a = new classA();
	classB b = new classB();
	
	DeadLock() {
		Thread.currentThread().setName("MainThread");
		//Thread.cuurentThread() <=> main方法中new出来的实例线程
		a.b = b;
		//a中的b引用新建的b
		b.a = a;
		//b中的a引用新建的a
		new Thread(this).start();
		//this构造方法，调用自身的构造器，重新new一个实例线程
		//现在有两个实例线程，一个是main方法中new出来的
		//另一个是new出来的实例线程在调用自身构造器时new出来的
		a.methoda();
		//MainThread调用a的方法a
		//而方法a调用a的方法b
		System.out.println("back to main thread");
	}
	
	public void run() {
		Thread.currentThread().setName("RacingThread");
		//Thread.cuurentThread() <=> run方法中new出来的实例线程
		b.methoda();
		//RacingThread调用classB的方法a
		//而方法a调用b的方法b
		System.out.println("back to racing thread");
	}

	public static void main(String[] args) {
		new DeadLock();
		//创建对象DeadLock后，DeadLock在构造时需要调用构造器（构造器此时视为一个线程）
		//而构造器又同时新建了另一个线程（这个线程不同于上面构造器线程自身）
		//这两个线程同时调用被synchronized的对方的一个方法
		//因为这两个线程都未结束，所以对方的方法都未解锁，都不能互相调用
	}
}