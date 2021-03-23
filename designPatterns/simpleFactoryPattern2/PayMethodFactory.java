package designPatterns.simpleFactoryPattern2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PayMethodFactory
{
//    public static AbstractPay getPayMethod(double balance, String type)
//    {
//        AbstractPay aPayMethod;  // 抽象类
//        Class payClass;     // 存放实际的支付类型的类型
//        Constructor payConstructor;  // 存放实际的支付类型的构造器
//
//        // 获得实际支付类型的类型
//        try
//        {
//            payClass = Class.forName(type);
//        }catch (ClassNotFoundException e)
//        {
//            System.out.println("没有这种支付方式，请在Cash/Creditcard/Voucher中选择.");
//        }
//
//        // 获得实际支付类型的构造器
//        try
//        {
//            payClass.newInstance(balance);  // 会返回一个Object类的对象
//        }catch (InstantiationException | IllegalAccessException | InvocationTargetException e)
//        {
//            System.out.println("调用构造器异常，请重新检查代码.");
//        }
//
//        return aPayMethod;
//    }
}
