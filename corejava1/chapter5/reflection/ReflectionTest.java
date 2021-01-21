package corejava1.chapter5.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * This program uses reflection to print all features of a class.
 * Java核心技术5-14.
 */
public class ReflectionTest
{
    public static void main(String[] args)
            throws ReflectiveOperationException
    {
        // read class name from command line args or user input
        String name;
        if (args.length > 0) name = args[0];
        else
        {
            var in = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date): ");
            name = in.next();
        }
        
        // print class name and superclass name (if != Object)
        // Class类的静态forName方法返回一个Class对象，表示名为显式参数的类
        Class cl = Class.forName(name);
        // Class类的getSuperclass方法返回一个Class对象，这个对象表示隐式参数的超类
        Class supercl = cl.getSuperclass();
        // Class类的getModifiers方法返回一个int值，用来表示隐式参数类的修饰符
        // Modifier类的静态toString方法会翻译这个int值，返回一个String对象
        String modifiers = Modifier.toString(cl.getModifiers());
        // 打印修饰符
        if (modifiers.length() > 0) System.out.print((modifiers + " "));
        // 打印类名
        System.out.print("class " + name);
        // 如果超类存在，且不为Object类，那么也打印出extend+超类名
        if (supercl != null && supercl != Object.class) System.out.print(" extends "
                + supercl.getName());
        
        // 打印类的具体定义
        System.out.print("\n{\n");
        printConstructors(cl);
        System.out.println();
        printMethods(cl);
        System.out.println();
        printFields(cl);
        System.out.println("}");
    }
    
    /**
     * Prints all constructors of a class(打印类的所有构造器)
     *
     * @param cl a class
     */
    public static void printConstructors(Class cl)
    {
        // getDeclaredConstructors方法会返回Class对象的所有构造器
        Constructor[] constructors = cl.getDeclaredConstructors();
        
        for (Constructor c : constructors)
        {
            // 用name保存构造器的名字
            String name = c.getName();
            // 打印一个缩进
            System.out.print("    ");
            
            /*
            Field、Method、Constructor类都有getModifiers方法
            Constructor类的getModifiers方法返回一个整数，描述这个构造器的修饰符
            Modifier类的静态toString方法会翻译这个整数对应的修饰符，并返回一个String对象
             */
            // 获取构造器的修饰符，并打印
            String modifiers = Modifier.toString(c.getModifiers());
            // 如果有修饰符（长度大于0），那么打印一个空格
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            // 打印出构造器的名字，并紧接一个(
            System.out.print(name + "(");
            
            /*
            Method、Constructor类都有getParameterTypes方法
            返回一个Class对象数组，其中各个对象表示参数的类型
             */
            // print parameter types
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++)
            {
                // 给方法参数加逗号分隔符
                if (j > 0) System.out.print(", ");
                // 输出参数的类型名称
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }
    
    /**
     * Prints all methods of a class(打印类的所有方法)
     *
     * @param cl
     */
    public static void printMethods(Class cl)
    {
        // 返回这个类或者接口的全部方法，但不包括由超类继承的方法
        Method[] methods = cl.getDeclaredMethods();
        
        for (Method m : methods)
        {
            // 返回一个用于表示返回类型的Class对象
            Class retType = m.getReturnType();
            String name = m.getName();
            // 打印一个缩进
            System.out.print("    ");
            
            // print modifiers, return type and method name
            /*
            Method类的getModifiers方法会返回方法的修饰符，用一个特殊的int值来表示
            Modifier类的静态方法toString会将这个值转化成对应的修饰符，并且打印输出
             */
            // print modifiers
            String modifiers = Modifier.toString(m.getModifiers());
            // print a space
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            // print method name
            System.out.print(retType.getName() + " " + name + "(");
            
            // print parameter types
            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++)
            {
                if (j > 0) System.out.print(", ");
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }
    
    /**
     * Prints all fields of a class(打印类的所有字段)
     *
     * @param cl a class
     */
    public static void printFields(Class cl)
    {
        // 返回包含Field对象的数组，这些对象对应这个类的全部字段
        Field[] fields = cl.getDeclaredFields();
        
        for (Field f : fields)
        {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("    ");
            // 输出修饰符
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            // 打印字段的类型，打印一个空格，打印字段自身的名称，最后打印分号
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}
