package zjuwengkai;

import stream.PrintWriteTest;

import java.util.Scanner;

/**
 * @auther 诸行无常
 * @date 2020/12/25 - 16:10
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.printf("%.2f", sum);
    }
}
