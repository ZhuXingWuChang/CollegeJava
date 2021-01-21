package corejava1.chapter5.enums;

import java.util.Scanner;

/**
 * This program demonstrates enumerated types.
 * Java核心技术5-12.
 */
public class EnumTest
{
    public static void main(String... args)
    {
        var in = new Scanner(System.in);
        System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = in.next().toUpperCase();
        
        // valueOf返回给定类中有指定名字的枚举常量
        Size size = Enum.valueOf(Size.class, input);  // Size.class 的语义是Size类
        
        // 现在size表示一个枚举常量
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE)
            System.out.println("Good job--you paid attention to the _.");
    }
}

enum Size
{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
    
    private Size(String abbreviation)
    {
        this.abbreviation = abbreviation;
    }
    
    public String getAbbreviation()
    {
        return abbreviation;
    }
    
    private String abbreviation;
}