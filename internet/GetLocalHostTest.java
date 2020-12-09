package internet;

import java.net.*;

public class GetLocalHostTest {
	public static void main(String[] args) {
		InetAddress myIP = null;
		try {
			myIP = InetAddress.getLocalHost();
		} catch(UnknownHostException e) {}
		System.out.println(myIP);
	}
}
