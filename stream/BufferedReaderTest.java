package stream;
/*
 * BankAccount类的实现在PrintWriter.java里
 */
import java.io.*;

public class BufferedReaderTest {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("myAccount2.dat"));
			BankAccount aBankAccount = new BankAccount(null, 0);
			aBankAccount.setOwnerName(in.readLine());
			//读到流的第一行
			aBankAccount.setAccountNumber(Integer.parseInt(in.readLine()));//parseInt将字符串转为int
			//读到流的第二行
			aBankAccount.setBalance(Float.parseFloat(in.readLine()));
			//读到流的第三行
			System.out.println(aBankAccount);
			System.out.println(aBankAccount.ownerName+'\n'+
					aBankAccount.accountNumber+'\n'+
					aBankAccount.balance);
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: Cannot open file for reading.");
		} catch (EOFException e) {
			System.out.println("Error: EOF encountered, file may be corrputed.");
		} catch (IOException e) {
			System.out.println("Error: Cannot read from file.");
		}
	}
}
