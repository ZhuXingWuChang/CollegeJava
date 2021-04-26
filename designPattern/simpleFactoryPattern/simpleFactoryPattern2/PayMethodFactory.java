package designPattern.simpleFactoryPattern.simpleFactoryPattern2;

import java.lang.reflect.Constructor;

public class PayMethodFactory
{
    
    public static AbstractPay getPayMethod(double balance, String type) throws Exception
    {
        type = "设计模式.设计模式.simpleFactoryPattern.simpleFactoryPattern2." + type + "Pay";
        Class<?> payClass = Class.forName(type);
        Constructor<?> payConstructor = payClass.getConstructor(double.class);
        
        return (AbstractPay) payConstructor.newInstance(balance);
    }
}
