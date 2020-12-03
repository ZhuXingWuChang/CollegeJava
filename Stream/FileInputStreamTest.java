package Stream;
import java.io.*;

public class FileInputStreamTest {
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("myFile.dat");
			while(in.available()>0)
				System.out.print(in.read()+" ");
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: Cannot open file for reading.");
			//不能打开文件供阅读
		} catch (EOFException e) {
			System.out.println("Error: EOF encountered, file may be corrupted.");
			//遇到EOF,文件可能被损坏
		} catch (IOException e) {
			System.out.println("Error: Cannot read from file.");
			//无法从文件中读取
		}
	}
}
//对于前两个catch，我们可以注释掉，但是不能注释掉第三个catch
//因为IOException属于IO里最高层次的Exception
