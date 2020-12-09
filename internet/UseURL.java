package internet;

import java.net.URL;
import java.net.MalformedURLException;

public class UseURL {
	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("https://live.bilibili.com/68382");
		} catch (MalformedURLException e) {
			System.out.println("MalformedURLException: " + e);
		}
		System.out.println("The URL is:");
		System.out.println(url);
		System.out.println("Use toString(): " + url.toString());
		System.out.println("Use ToExternalForm(): " + url.toExternalForm());
		System.out.println("Protocol is: " + url.getProtocol());
		System.out.println("Host is: " + url.getHost());
		System.out.println("Port is: " + url.getPort());
		System.out.println("File is: " + url.getFile());
	}
}
