package corejava1.chapter6.interfaces;

import java.util.Arrays;

/**
 * This program demonstrates the use of the Comparable interface.
 */
public class EmployeeSortTest
{
    public static void main(String[] args)
    {
        var staff = new Employee[3];
        
        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 30000);
        
        Arrays.sort(staff);
        
        // print out information about all Employee objects
        for (Employee e : staff)
        {
            System.out.println("name=" + e.getName() + " ,salary=" + e.getSalary());
        }
    }
}
