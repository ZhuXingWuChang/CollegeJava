package corejava1.chapter6.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * This is my program, it's doesn't come from book, it's come from 尚硅谷.
 *
 * @author ZhuXingWuChang
 */
public class TestLambda4
{
    public void test4()
    {
        List<String> list = Arrays.asList("Hello", "atguigu", "Lambda", "www", "ok");
        List<String> strList = filterStr(list, s -> s.length() > 3);
        
        for (String str : strList)
            System.out.println(str);
    }
    
    //Predicate<T> 断言型接口：
    public List<String> filterStr(List<String> list, Predicate<String> pre)
    {
        List<String> strList = new ArrayList<>();
        
        for (String str : list)
            if (pre.test(str))
                strList.add(str);
        
        return strList;
    }
    
    public void test3()
    {
        String newStr = strHandler("\t\t\t 我大尚硅谷威武   ", str -> str.trim());
        System.out.println(newStr);
        
        String subStr = strHandler("我大尚硅谷威武", str -> str.substring(2, 5));
        System.out.println(subStr);
    }
    
    //Function<T, R> 函数型接口：
    public String strHandler(String str, Function<String, String> fun)
    {
        return fun.apply(str);
    }
    
    public void test2()
    {
        List<Integer> numList = getNumList(10, () -> (int) (Math.random() * 100));
        
        for (Integer num : numList)
            System.out.println(num);
    }
    
    //Supplier<T> 供给型接口：
    public List<Integer> getNumList(int num, Supplier<Integer> sup)
    {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < num; i++)
        {
            Integer n = sup.get();
            list.add(n);
        }
        
        return list;
    }
    
    public void test1()
    {
        happy(10000, m -> System.out.println("你们刚哥喜欢大保健，每次消费:" + m + "元"));
    }
    
    //Comsumer<T> 消费型接口：
    public void happy(double money, Consumer<Double> con)
    {
        con.accept(money);
    }
    
    public static void main(String[] args)
    {
        TestLambda4 t = new TestLambda4();
        t.test1();
        t.test2();
        t.test3();
        t.test4();
    }
}
