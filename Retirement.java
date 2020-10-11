import java.util.*;

/*
 * This program demonstrates a <code>while</code> loop.
 * (这个程序演示了一个while循环.)
 * Java核心技术，程序清单3-3，P68
 */
public class Retirement
{
	public static void main(String[] args)
	{
		//read inputs
		Scanner in = new Scanner(System.in);
		
		System.out.print("How much money do you need to retire? ");//retire:退休
		double goal = in.nextDouble();//goal:目标
		
		System.out.print("How much money will you contribute every year? ");//你每年打算存多少钱?
		double payment = in.nextDouble();//payment:报酬	(存入的钱)
		
		System.out.print("Interest rate in %: ");//利率%:
		double interestRate = in.nextDouble();//interest rate:利率
		
		double balance = 0;//balance:余额
		int years = 0;
		
		//update account balance while goal isn't reached(当目标未达到时，更新帐户余额)
		while (balance < goal)
		{
			//add this year's payment and interest
			balance += payment;//计算余额
			double interest = balance * interestRate / 100;//interest:利息	利息=余额*利率/100
			balance += interest;//加上利息
			years++;
		}
		
		System.out.println("You can retire in " + years + " years.");//n年后你就可以退休了
	}
}