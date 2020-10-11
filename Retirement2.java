import java.util.*;

/*
 * This program demonstrates a <code>do/while</code> loop.
 * (这个程序演示了一个do while循环.) goal:目标  payment:存入  interest rate:利率  balance:余额  interest:利息
 * Java核心技术，程序清单3-4，P68
 */
public class Retirement2 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("How much money will you contribute every year? ");
		double payment = in.nextDouble();
		
		System.out.print("Interest rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int year = 0;
		
		String input;
		
		//update account balance while user isn't ready to retire(当用户还没有准备好退休时更新帐户余额)
		do
		{
			//add this year's payment and interest(加上今年的支付和利息)
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			
			year++;
			
			//print current balance(打印当前余额)
			System.out.printf("After year %d, your balance is %,.2f%n", year, balance);//P58
			
			//ask if ready to retire and get input(问问自己是否准备退休了，并得到一些建议)
			System.out.print("Ready to retire? (Y/N) ");
			input = in.next();
		}while(input.equals("N"));
	}
}
