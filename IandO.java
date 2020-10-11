import java.util.*;//当使用的类不是java.lang包中的时，一定要import导入相应的包

public class IandO {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//构造一个Scanner对象(名为in)，现在我们可以用Scanner类的各种方法读取输入了
		
		//nextLine方法将读取一行输入(遇到'\n'停止)
		System.out.println("What is your name?");
		String name = in.nextLine();
		System.out.println("Your name is: " + name + ".");
		
		//next方法可以读取一个单词(遇到分隔符，如空格，停止)
		System.out.println("What is your mother name?");
		String firstName = in.next();
		System.out.println("Your mother firstname is: " + firstName + ".");
	}

}
