import java.util.Scanner;

public class BreakAndContinue
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("你的目标存款是多少? ");
		int goal = in.nextInt();
		
		System.out.print("你每年会存多少钱? ");
		int payment = in.nextInt();
		
		System.out.print("银行的利率是百分之几? ");
		int interestRate = in.nextInt();
		
		double balance = 0;
		int years = 0;
		
		while (years <= 100)
		{
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			if (balance >= goal) break;
			years++;
		}
		
		System.out.printf("再过%d年你就可以退休了.", years);
	}
}
