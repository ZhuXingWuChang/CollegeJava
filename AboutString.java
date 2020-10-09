/*
 * Java核心技术，字符串的主要内容。
 */
public class AboutString {

	public static void main(String[] args) {
		String e = "";	//这是一个空串，它的长度为0
		String str = null;	//它和空串并不相同
		String greeting = "Hello";
		
		//length方法用于返回字符串的字符个数
		int n = greeting.length();
		System.out.println("n = " + n);
		
		//String类的substring方法可以从一个较大的字符串提取出一个子串（substring：子串）
		//substring方法的第二个参数是“不想复制”的第一个位置
		String s = greeting.substring(0, 3);
		System.out.println("s = " + s);
		
		//如果需要把多个字符串放在一起，用一个界定符分割，可以使用静态join方法（join：连接）
		//join方法的第一个参数是分隔符，出现在后面多个参数之间
		String all = String.join(" / ", "S", "M", "L", "XL");
		System.out.println("all = " + all);
		
		//在Java11中，还提供了一个repeat方法（repeat：重复写）
		String repeated = "Java".repeat(3);
		System.out.println("repeated = " + repeated);
		
		greeting = greeting.substring(0, 3) + "p!";
		System.out.println("new greeting = " + greeting);
		
		//可以使用equals方法检测两个字符串是否相等，区分大小写
		//可以使用equalsIgnoreCase方法检测两个字符串是否相等，不区分大小写(ignore：忽略）
		System.out.println("help!".equals(greeting));
		System.out.println("help!".equalsIgnoreCase(greeting));
		System.out.println("空串和null相等吗？ " + e.equals(str));
		
		//每次拼接字符串时，都会构建一个String对象，即耗时，又浪费空间
		//使用StringBuilder类就可以避免这个问题（builder：建筑者）
		StringBuilder builder = new StringBuilder();
		//调用StringBuilder类中的append方法来添加内容
		char a = 'I';
		System.out.println("添加一个字符后：" + builder.append(a));		//添加一个char
		String b =" love you!";
		System.out.println("添加一个字符串后：" + builder.append(b));	//添加一个string
	}

}
