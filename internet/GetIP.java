package internet;
import java.net.*;

public class GetIP {
	public static void main(String[] args) {
		InetAddress hd = null;
		//InetAddress静态类有一个getByName方法，没有构造器
		try {
			hd = InetAddress.getByName("jwc.yangtzeu.edu.cn");
			//只能通过调用类方法来获取IP
		} catch(UnknownHostException e) {}
		System.out.println(hd);
	}
}
