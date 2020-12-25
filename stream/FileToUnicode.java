package stream;

import java.io.*;

public class FileToUnicode {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("file1.txt");
			//为了读文件流
			InputStreamReader dis = new InputStreamReader(fis);
			//让文件流转换成字符流
			BufferedReader reader = new BufferedReader(dis);
			//让缓冲区读入字符流
			String s;
			while( (s = reader.readLine()) != null ) {
				System.out.println("read: "+s);
			}
			dis.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
