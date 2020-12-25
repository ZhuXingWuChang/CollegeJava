package stream;
import java.io.*;

public class PipedStreamDemo {//demo:样本
	public static void main(String[] args) throws IOException {
		PipedOutputStream pos = new PipedOutputStream();
		//先建立好输出端(从JVM内的一个线程输出)
		
		PipedInputStream pis = new PipedInputStream(pos);
		//再建立好输入端(往JVM内的另一个线程输入)
		
		byte datamover = 65;
		//一个byte类型的数据
		
		System.out.println("\nNow I start to work......\n");
		try {
			System.out.println("transfer "+datamover+" to pos.\n");
			//将数据转移到管道输出流
			pos.write(datamover);
			//讲数据写入管道输出流
			System.out.println("pis get:"+(byte)pis.read());
			//看一看管道输入流得到了什么数据
		} finally {
			pis.close();
			pos.close();
		}
	}
}
