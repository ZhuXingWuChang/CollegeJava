package corejava1.chapter6.lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/**
 * This program demonstrates the use of lambda expressions.
 * Java核心技术6-6.
 */
public class LambdaTest
{
    public static void main(String[] args)
    {
        var planets = new String[]{"Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        // 原本sort需要一个数组和一个比较器作为参数，但是lambda表达式让我们可以传过去一段代码
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));
        
        var timer = new Timer(1000, event ->
                System.out.println("The time is " + new Date()));
        timer.start();
        
        // keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
