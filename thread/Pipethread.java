package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;

class myWriter extends Thread {
	private PipedOutputStream outStream;
	private String messages[] = { "Monday", "Tuesday", "Wednsday",
			"Thursday", "Friday", "Saturday", "Sunday" };
	
	public myWriter(PipedOutputStream o) {//把参数o写入管道流
		outStream = o;
	}
	
	public void run() {
		PrintStream p = new PrintStream(outStream);
		//将向管道输出的流转换为打印流
		for ( int i=0 ; i<messages.length ; i++) {
			p.println(messages[i]);
			p.flush();
			//把流输出到管道里
			System.out.println("Write: " + messages[i]);
			//与此同时把流输出到屏幕上
		}
		p.close();
		p = null;//打印流不再引用任何流
	}
}

class myReader extends Thread {
	private PipedInputStream inStream;
	
	public myReader(PipedInputStream i) {//从管道流中读出参数i
		inStream = i;
	}
	
	public void run() {
		String line;
		boolean reading = true;
		BufferedReader d = new BufferedReader(new InputStreamReader(inStream));
		//把管道输入流转换为输入字符流，再转换为缓冲区输入字符流
		while(reading && d != null) {//如果可读且流不为空
			try {
				line = d.readLine();//读取流的一行
				if(line != null) System.out.println("Read: " + line);
				else reading = false;
			} catch(IOException e) {
				System.out.println("线程出现IOException（IO异常）");
			}
		}
		try {
			Thread.currentThread().sleep(4000);//读完之后，睡眠4000ms，即4s
		} catch(InterruptedException e) {
			System.out.println("出现InterruptedException（线程中断异常）");
		}
	}
}

public class Pipethread {
	public static void main(String[] args) throws IOException {
		Pipethread thisPipe = new Pipethread();
		thisPipe.process();//创建一个线程
	}
	
	public void process() throws IOException {
		PipedInputStream inStream;
		PipedOutputStream outStream;
		try {
			outStream = new PipedOutputStream();
			inStream = new PipedInputStream(outStream);
			new myWriter(outStream).start();//先启动输出流线程
			new myReader(inStream).start();//再启动输入流线程
		} catch(IOException e) {
			System.out.println("进程出现IOException（IO异常）");
		}
	}
}
