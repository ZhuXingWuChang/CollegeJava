import java.math.*;
import java.util.*;

/* 程序清单3-6是对程序清单3-5中彩概率程序的改进，使其可以处理大数。
 * This program uses big numbers to compute the odds of winning the grand prize in a lottery.
 * (这个程序使用大数字来计算中彩票大奖的几率)
 * Java核心技术，程序清单3-6，P77
 */
public class BigIntegerTest
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many numbers do you need do draw? ");//你需要抽几个号码?
		int k = in.nextInt();
		
		System.out.print("What is the highest number you can draw? ");//你能画出的最大数字是多少?
		int n = in.nextInt();
		
		/*
		 * 计算二项式系数
		 */
		//valueOf:把基本类型转化为对象类型的方法
		BigInteger lotteryOdds = BigInteger.valueOf(1);//使用静态的valueOf方法可以将普通的数转换为大数
		//multiply:乘
		for (int i = 1; i<= k; i++)
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1).divide(
					BigInteger.valueOf(i)));
		
		System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
	}
}