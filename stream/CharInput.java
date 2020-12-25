package stream;
import java.io.*;

public class CharInput {
	public static void main(String[] args) throws IOException {
		String s;
		InputStreamReader ir;
		BufferedReader in;
		ir = new InputStreamReader(System.in);//从键盘读入输入流
		in = new BufferedReader(ir);//把输入流转换为缓冲区流
		while ((s = in.readLine()) != null) {
			System.out.println("Read: "+s);
		}
	}
}
