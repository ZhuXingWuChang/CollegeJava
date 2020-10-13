import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] b;//声明一个变量b用于存放数组 int b[]也是合法的，只不过不常用
		int[] a = new int[3];//使用new操作符创建数组
		b = a;
		//未初始化的数字数组，所有元素都初始化为0，boolean数组所有元素初始化为false，String数组所有元素初始化为null
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
		
		//Java可以用变量定义数组的长度
		System.out.print("输入数组长度n: ");
		int n = in.nextInt();
		boolean[] c = new boolean[n];
		
		//初始化数组
		int[] smallPrimes = { 2, 3, 5, 11, 13 };
		for (int i = 0; i < smallPrimes.length; i++)
			System.out.print(smallPrimes[i] + " ");
		System.out.println();
		
		//可以创建String类型的数组
		String[] authors = {
				"James Gosling",
				"Bill Joy",
				"Guy Steele",
		};
		for (int i = 0; i < authors.length; i++)
			System.out.print(authors[i] + "|");
		System.out.println();
		
		//声明一个匿名数组: new int[] { 17, 19, 23, 29, 31, 37 }
		//可以使用这种语法重新初始化一个数组而无需创建新变量
		smallPrimes = new int[] { 17, 19, 23, 29, 31, 37 };
		//for each循环，用来遍历数组中的每一个元素
		for (int element : smallPrimes)
			System.out.println(element);
	}

}
