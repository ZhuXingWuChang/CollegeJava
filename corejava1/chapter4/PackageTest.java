package corejava1.chapter4;

import corejava1.chapter4.com.horstmann.Employee;

import static java.lang.System.out;

/**
 * This program demonstrates the use of packages.
 * Java核心技术4-6.
 */
public class PackageTest {
    public static void main(String[] args) {
        // because of the import statement, we don't hava to use
        // corejava.chapter4.com.horstmann.Employee here
        var harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

        harry.raiseSalary(5);

        // because of the satatic import statement, we don't have to use System.out here
        out.println("name=" + harry.getName() + " ,salary=" + harry.getSalary());
    }
}
