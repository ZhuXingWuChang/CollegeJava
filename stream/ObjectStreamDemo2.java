package stream;
import java.io.*;

public class ObjectStreamDemo2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Object d = null;
		FileInputStream f = new FileInputStream("String.ser");
		//由File输入一个Stream f
		
		ObjectInputStream s = new ObjectInputStream(f);
		//由f输一个ObjectStream s
		
		try {
			d = s.readObject();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("String serialzed at "+d);
	}
}