package corejava1.chapter5.objectAnalyzer;

import corejava1.chapter5.equals.Employee;

import java.util.ArrayList;

/**
 * This program uses reflection to spy on objects.
 * Java核心技术5-15.
 */
public class objectAnalyzerTest
{
    public static void main(String[] args)
            throws ReflectiveOperationException
    {
        ObjectAnalyzer objectMessage = new ObjectAnalyzer();
        
        var squares = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++)
            squares.add(i * i);
        System.out.println(objectMessage.toString(squares));
    
        var stringArray = new ArrayList<String>();
        for (int i = 1; i<=3; i++)
            stringArray.add("Hello"+i);
        System.out.println(objectMessage.toString(stringArray));
        
        var bob = new Employee("Bob Brandson", 50000, 1989, 10, 1);
        System.out.println(objectMessage.toString(bob));
    }
}
