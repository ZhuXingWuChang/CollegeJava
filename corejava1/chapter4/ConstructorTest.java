package corejava1.chapter4;

import java.util.Random;

/**
 * This program demonstrates object construction.
 * Java核心技术4-5.
 */
public class ConstructorTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee4 objects
        var staff = new Employee4[3];

        staff[0] = new Employee4("Harry", 40000);
        staff[1] = new Employee4(60000);
        staff[2] = new Employee4();

        // print out information about all Employee4 objects
        for (Employee4 e : staff) {
            System.out.println("name=" + e.getName() + " ,id=" + e.getId() + " ,salary="
                    + e.getSalary());
        }
    }
}

class Employee4 {
    private static int nextId;

    private int id;
    private String name = ""; // instance field initialization
    private double salary;

    // static initialization block
    static {
        var generator = new Random();
        // set nextId to a random number between 0 and 9999
        // Random类的nextInt方法返回一个 0 ~ (参数-1) 之间的随机值
        nextId = generator.nextInt(10000);
    }

    // object initialization block
    {
        id = nextId;
        nextId++;
    }

    // three overloaded constructors
    public Employee4(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee4(double s) {
        // call the Employee(String, double) constructor
        this("Employee #" + nextId, s);
    }

    // the deault constructor
    public Employee4() {
        // name initialized to ""-- see above
        // salary not explocitly set--initialized to 0
        // id initialized in initialization block
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
