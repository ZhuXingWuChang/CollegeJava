package Stream;
/*
 * PrintWriter是io包里面的一个类
 * 提供了print()和println()方法
 */
import java.io.*;

public class PrintWriteTest {
	public static void main(String[] args) {
		try {
			PrintWriter out = new PrintWriter(new FileWriter("myAccount2.dat"));
			//上面的语句与下面的等价:
			//FileWriter fo = new FileWriter("myAccount2.dat");
			//PrintWriter out = new PrintWriter(fo);
			
			//对PrintWriter对象out进行print()和println()操作，向其中输入字符流
			BankAccount aBankAccount = new BankAccount("LiuWei",3000);
			out.println(aBankAccount.getOwnerName());
			out.println(aBankAccount.getAccountNumber());
			out.println(aBankAccount.getBalance());
			out.close();
			//aBankAccount的信息都写入了myAccount2.dat文件
			//文件内容如下:
			//Liuwei
			//3000
			//0
		} catch (FileNotFoundException e) {
			//这里由于作用域的限制，不能用out
			System.out.println("Error: Cannot open file for writing.");
		} catch (IOException e) {
			System.out.println("Erroe: Cannot write to file.");
		}
	}
}

class BankAccount {//银行 帐户
	String ownerName;//所有者名称
	int accountNumber;
	float balance;//余额
	String getOwnerName() {
		return ownerName;
	}
	void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	int getAccountNumber() {
		return accountNumber;
	}
	void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	float getBalance() {
		return balance;
	}
	void setBalance(float balance) {
		this.balance = balance;
	}
	BankAccount(String ownerName, int accountNumber) {
		super();
		this.ownerName = ownerName;
		this.accountNumber = accountNumber;
	}
	BankAccount(String ownerName, int accountNumber, float balance) {
		this.ownerName = ownerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
}