package corejava1.chapter6.lambda;

/**
 * This is my program, it's doesn't come from book. It's come from 尚硅谷.
 *
 * @author ZhuXingWuChang
 */
public class TestLambda3
{
    public void test2()
    {
        String trimStr = strHandler("\t\t\t 我大尚硅谷威武   ", str -> str.trim());
        System.out.println(trimStr);
        
        String upper = strHandler("abcdef", str -> str.toUpperCase());
        System.out.println(upper);
        
        String subString = strHandler("我大尚硅谷威武", str -> str.substring(2, 5));
        System.out.println(subString);
    }
    
    // 用于处理字符串
    public String strHandler(String str, MyFunction mf)
    {
        return mf.getValue(str);
    }
    
    public void test3()
    {
        op(100L, 200L, (x, y) -> x + y);
        op(100L, 200L, (x, y) -> x * x + y * y);
    }
    
    public void op(Long l1, Long l2, MyFunction2<Long, Long> mf)
    {
        System.out.println(mf.getValue(l1, l2));
    }
    
    public static void main(String[] args)
    {
        TestLambda3 t = new TestLambda3();
        t.test2();
        t.test3();
    }
}
