package corejava1.chapter6.lambda;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.*;

/**
 * This is my program, it's doesn't come from book. It's come from 尚硅谷.
 *
 * @author ZhuXingWuChang
 */
public class TestMethodRef
{
    // 对象::实例方法名
    public void test1()
    {
        PrintStream ps1 = System.out;
        
        Consumer<String> con = x -> ps1.println(x);
        
        Consumer<String> con1 = System.out::println;
        con1.accept("abcedf");
    }
    
    // 对象::实例方法名
    public void test2()
    {
        Employee emp = new Employee("张三", 18, 5000.0);
        Supplier<String> sup = () -> emp.getName();
        String str = sup.get();
        System.out.println(str);
        
        Supplier<Integer> sup2 = emp::getAge;
        Integer num = sup2.get();
        System.out.println(num);
    }
    
    // 类::静态方法名
    public void test3()
    {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        
        Comparator<Integer> com1 = Integer::compare;
    }
    
    // 类::实例方法名
    public void test4()
    {
        BiPredicate<String, String> bp = (x, y) -> x.equals(y);
        
        BiPredicate<String, String> bp2 = String::equals;
    }
    
    // 构造器引用
    public void test5()
    {
        Supplier<Employee> sup = () -> new Employee();
        
        //调用无参构造器
        Supplier<Employee> sup2 = Employee::new;
        Employee emp = sup2.get();
        System.out.println(emp);
    }
    
    public void test6()
    {
        Function<Integer, Employee> fun = x -> new Employee(x);
        
        Function<Integer, Employee> fun2 = Employee::new;
        Employee emp = fun2.apply(50);
        System.out.println(emp);
        
        BiFunction<String, Integer, Employee> bf = Employee::new;
    }
    
    public void test7()
    {
        Function<Integer, String[]> fun = x -> new String[x];
        String[] strs = fun.apply(10);
        System.out.println(strs.length);
        
        Function<Integer, String[]> fun2 = String[]::new;
        String[] strs2 = fun2.apply(20);
        System.out.println(strs2.length);
    }
    
    public static void main(String[] args)
    {
        TestMethodRef tmr = new TestMethodRef();
        tmr.test1();
        tmr.test2();
        tmr.test3();
        tmr.test4();
        tmr.test5();
        tmr.test6();
        tmr.test7();
    }
}
