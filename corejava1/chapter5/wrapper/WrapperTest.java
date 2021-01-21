package corejava1.chapter5.wrapper;

/**
 * This program demonstrates wrapper.
 * It's doesn't from the book, it's my programed.
 *
 * @author ZhuXingWuChang
 */
public class WrapperTest
{
    public static void main(String[] args)
    {
        // 介于-128和127之间的short和int被包装到固定的对象当中，所以i和j是指向同一个对象的引用
        Integer i = 5;
        Integer j = 5;
        int ihash = i.hashCode();
        int jhash = j.hashCode();
        System.out.println(i == j);
        System.out.println(i.equals(j));
        System.out.println(ihash == jhash);
        
        // 这里m和n就不是指向同一个对象的引用了
        Integer m = 128;
        Integer n = 128;
        int mhash = m.hashCode();
        int nhash = n.hashCode();
        System.out.println(m == n);
        System.out.println(m.equals(n));
        System.out.println(mhash == nhash);
    }
}
