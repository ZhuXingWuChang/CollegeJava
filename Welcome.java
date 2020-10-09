/*
 * This program displays a greeting for the reader.
 * Java核心技术，程序清单2-1
 */
package Welcome;

public class Welcome {
	public static void main(String[] args) {
		String greeting = "Welcome to Core Java!";
		System.out.println(greeting);
		for (int i = 0; i<greeting.length(); i++)
			System.out.print("=");
		System.err.println();
	}
}
