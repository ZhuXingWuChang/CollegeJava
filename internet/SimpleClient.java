package internet;

import java.net.*;
import java.io.*;

public class SimpleClient {
	public static void main(String[] args) throws IOException {
		int c;
		Socket s1;
		InputStream s1In;
		DataInputStream dis;
		
		//在端口5432打开连结
		s1 = new Socket("subbert", 5432);
		//获得Socket端口的输入句柄，并从中读取数据
		s1In = s1.getInputStream();
		dis = new DataInputStream(s1In);
		
		String st = new String(dis.readUTF());
		System.out.println(st);
		
		//操作结束，关闭数据流及Socket连接
		dis.close();
		s1In.close();
		s1.close();
		//需要注意，在关闭socket之前，需要关闭与之连接的流
	}
}
