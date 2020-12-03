package Stream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {
	public static void main(String[] args) throws IOException {
		String d = "Hello!";
		FileOutputStream f = new FileOutputStream("String.ser");
		//建立一个文件输出流(把文件流f输出到文件String.ser中)
		
		ObjectOutputStream s = new ObjectOutputStream(f);
		//建立一个对象输出流(把对象流s输出到文件流f里)
		
		try {
			s.writeObject(d);//把String d写入到对象流s里面
			s.close();
			//于是d到s，s到f，f到String.ser，成功把d写入文件
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
