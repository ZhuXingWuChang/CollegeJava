package zuoye1;
/*
 * 例2-8	静态变量定义示例
 */
public class Count {
	private int serialNumber;//类定义了私有的成员变量，这个变量私有地属于类所构造出来的对象
	private static int counter = 0;//类所属的私有的静态变量，这个变量不属于任何对象，而属于这个类
	
	public Count () {//构造方法，定义对象的时候从这里进入
		counter++;
		serialNumber = counter;
	}
	
	public static void main(String[] args) {
		Count one = new Count();
		System.out.println(one.serialNumber);
		System.out.println(counter);
		
		Count two = new Count();
		System.out.println(two.serialNumber);
		System.out.println(counter);
		
		Count three = new Count();
		System.out.println(three.serialNumber);
		System.out.println(counter);
	}

}
