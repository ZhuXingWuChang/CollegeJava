package Stream;
/**
 * 用writeObject()方法可以直接将对象保存到输出流中
 * @author 诸行无常
 */
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Objectser implements Serializable {
	public static void main(String[] args) {
		Student stu = new Student(981036, "Li Ming", 16, "CSD");
		try {
			FileOutputStream fo = new FileOutputStream("data.ser");
			//对data.ser输出一个fo流
			ObjectOutputStream so = new ObjectOutputStream(fo);
			//对fo流输出一个so流
			so.writeObject(stu);
			//将stu写到输出流so里，从而stu->so->fo->data.ser
			so.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
