package corejava1.chapter6.lambda;

import java.util.*;
import java.util.function.Consumer;

/**
 * This is my program, it's doesn't come from book. It's come from 尚硅谷.
 *
 * @author ZhuXingWuChang
 */
public class TestLambda2
{
    public void test1()
    {
        int num = 0; // 匿名内部类的成员变量是final, num++不通过编译
        
        Runnable r = new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("Hello World!");
            }
        };
        r.run();
        
        System.out.println("-------------------------------------");
        
        Runnable r1 = () -> System.out.println("Hello Lambda!");
        r1.run();
    }
    
    public void test2()
    {
        Consumer<String> con = x -> System.out.println(x);
        con.accept("我大尚硅谷威武！");
    }
    
    public void test3()
    {
        Comparator<Integer> com = (Integer x, Integer y) -> {
            System.out.println("函数式接口");
            return Integer.compare(x, y);
        };
        
        System.out.println(com);
    }
    
    public void test4()
    {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        
        System.out.println(com);
    }
    
    // Java语法糖
    public void test5()
    {
        String[] strs = {"aaa", "bbb", "ccc"};
        List<String> list = new ArrayList<>();
        show(new HashMap<>());
    }
    
    public void show(Map<String, Integer> map)
    {
    
    }
    
    public void test6()
    {
        Integer num = operation(100, x -> x * x);
        System.out.println(num);
        
        System.out.println(operation(200, y -> y + 200));
    }
    
    public Integer operation(Integer num, MyFun mf)
    {
        return mf.getValue(num);
    }
    
    public static void main(String[] args)
    {
        TestLambda2 test = new TestLambda2();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        
        test.test6();
    }
}
