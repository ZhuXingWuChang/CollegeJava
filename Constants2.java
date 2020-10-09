/*
 * 在Java中，经常希望某个常量可以在一个类的多个方法中使用，通常将这些常量成为
 * 类常量(class constant)。可以使用关键字static final设置一个类常量。
 */
public class Constants2 {
	public static final double CM_PER_INCH = 2.54;
	
	public static void main(String[] args) {
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper size in centimeters: "
				+ paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}

}
