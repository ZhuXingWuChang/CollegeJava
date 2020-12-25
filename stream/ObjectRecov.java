package stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectRecov {

	public static void main(String[] args) {
		Student stu = null;
		try {
			FileInputStream fi = new FileInputStream("data.ser");
			ObjectInputStream si = new ObjectInputStream(fi);
			stu = (Student)si.readObject();
			si.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("ID: "+stu.id+"\nname:"+stu.name+
				"\nage:"+stu.age+"\ndept.:"+stu.department);
	}
}
