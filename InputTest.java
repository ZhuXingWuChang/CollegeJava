import java.util.*;

/*
 * This program demonstrates console input.
 * (demonstrates:示范	console:控制台	input:输入)
 * Java核心技术，程序清单3-2，P56
 */
public class InputTest
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);//创造一个对象in用于输入
		
		//get first input
		System.out.print("What is your name? ");
		String name = in.nextLine();
		
		//get second input
		System.out.print("How old are you? ");
		int age = in.nextInt();
		
		//display output on console
		System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
	}
}
