package corejava1.chapter6.lambda;

import java.util.*;

/**
 * This is my program, it's doesn't come from book. It's come from 尚硅谷.
 *
 * @author ZhuXingWuChang.
 */
public class TestLambda
{
    // 用匿名内部类实现
    public void test1()
    {
        Comparator<Integer> com = new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return Integer.compare(o1, o2);
            }
        };
        
        TreeSet<Integer> ts = new TreeSet<>(com);
    }
    
    // 用lambda表达式实现
    public void test2()
    {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        
        TreeSet<Integer> ts = new TreeSet<>(com);
    }
    
    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 9999.99),
            new Employee("李四", 38, 5555.55),
            new Employee("王五", 50, 6666.66),
            new Employee("赵六", 16, 3333.33),
            new Employee("田七", 8, 7777.77)
    );
    
    // 需求：获取当前公司中员工年龄大于35的员工信息
    public void test3()
    {
        List<Employee> list = filterEmployees(employees);
        
        for (Employee employee : list)
            System.out.println(employee);
    }
    
    public List<Employee> filterEmployees(List<Employee> list)
    {
        List<Employee> emps = new ArrayList<>();
        
        for (Employee emp : list)
            if (emp.getAge() >= 35)
                emps.add(emp);
        
        return emps;
    }
    
    // 需求：获取当前公司中员工工资大于5000的员工信息
    public List<Employee> filterEmployees2(List<Employee> list)
    {
        List<Employee> emps = new ArrayList<>();
        
        for (Employee emp : list)
            if (emp.getSalary() >= 5000.0)
                emps.add(emp);
        
        return emps;
    }
    
    // 优化方式一：策略设计模式
    public void test4()
    {
        List<Employee> list = filterEmployee(employees, new FilterEmployeeByAge());
        
        for (Employee employee : list)
            System.out.println(employee);
        
        System.out.println("-------------------------");
        
        List<Employee> list2 = filterEmployee(list, new FilterEmployeeBySalary());
        
        for (Employee employee : list2)
            System.out.println(employee);
    }
    
    public List<Employee> filterEmployee(List<Employee> list, MyPredicate<Employee> mp)
    {
        List<Employee> emps = new ArrayList<>();
        
        for (Employee employee : list)
            if (mp.test(employee))
                emps.add(employee);
        
        return emps;
    }
    
    // 优化方式二：匿名内部类
    public void test5()
    {
        List<Employee> list = filterEmployee(employees, new MyPredicate<Employee>()
        {
            @Override
            public boolean test(Employee t)
            {
                return t.getSalary() <= 5000;
            }
        });
        
        for (Employee employee : list)
            System.out.println(employee);
    }
    
    // 优化方式三：lambda表达式
    public void test6()
    {
        List<Employee> list = filterEmployee(employees, (e) -> e.getSalary() <= 5000.0);
        list.forEach(System.out::println);
    }
    
    // 优化方式四：Stream API
    public void test7()
    {
        employees.stream().filter((e) -> e.getSalary() >= 5000.0).forEach(System.out::println);
    }
}
