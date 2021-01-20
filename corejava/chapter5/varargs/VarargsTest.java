package corejava.chapter5.varargs;

/**
 * This program demonstrates varargs method.
 * It's doesn't from the book, it's my programed.
 *
 * @author ZhuXingWuChang
 */
public class VarargsTest
{
    public static double max(double... values)
    {
        // NEGATIVE_INFINITY 相当于一个计算机中的下确界值
        double largest = Double.NEGATIVE_INFINITY;
        for (double v : values) if (v > largest) largest = v;
        return largest;
    }
    
    public static void main(String[] args)
    {
        double test1 = max(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(test1);
        
        double test2 = max(new double[]{-3.2, 20.4, 77.9, 1024.0});
        System.out.println(test2);
    }
}
