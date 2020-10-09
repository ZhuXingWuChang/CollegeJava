/*
 * 在Math类中，sqrt方法可以求平方根，pow方法可以幂运算。
 * Java核心技术，P38。
 */
public class MathClass {

	public static void main(String[] args) {
		double x = 4;
		double y = Math.sqrt(x);
		System.out.println("y = " + y);
		double z = Math.pow(x, 5);
		System.out.println("z = " + z);
	}

}
