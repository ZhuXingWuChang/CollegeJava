package corejava1.chapter6.clone;

/**
 * This program demonstrates cloning.
 * Java核心技术6-4.
 */
public class CloneTest
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        var original = new Employee("John Q. Public", 50000);
        original.setHireDay(2000, 1, 1);
        Employee copy = original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2002, 12, 31);
        System.out.println("original=" + original);
        System.out.println("copy=" + copy);
    }
}
