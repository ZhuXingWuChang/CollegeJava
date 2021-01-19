package corejava.chapter5.arrayList;

import corejava.chapter5.inheritance.Employee;

import java.util.*;

/**
 * This program demonstrates the ArrayList class.
 */
public class ArrayListTest
{
    public static void main(String[] args)
    {
        // fill the staff array list with three Employee objects
        var staff = new ArrayList<Employee>(3);
        
        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Hacker", 50000, 1989, 3, 15));
        staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));
        
        // raise everyone's salary by 5%
        for (Employee e : staff)
            e.raiseSalary(5);
        
        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + " ,salary=" + e.getSalary() + " ,hireDay="
                    + e.getHireDay());
    }
}
