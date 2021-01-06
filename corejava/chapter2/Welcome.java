package corejava.chapter2;

/**
 * This program displays a greeting for the reader.
 * Java核心技术2-1.
 */

public class Welcome {
    public static void main(String[] args) {
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}