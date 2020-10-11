import java.util.*;//当使用的类不是java.lang包中的时，一定要import导入相应的包

public class IOnumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//构造一个Scanner对象(名为in)，现在我们可以用Scanner类的各种方法读取输入了
		
		//nextInt方法可以读取一个int类型值，nextDouble方法同理
		System.out.println("How old are you?");
		int age = in.nextInt();
		System.out.println("You are " + age + ".");
	}

}
