package designPatterns.simpleFactoryPattern2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PayMethodFactory
{
    
    public static AbstractPay getPayMethod(double balance, String type) throws Exception
    {
        type = "designPatterns.simpleFactoryPattern2." + type + "Pay";
        Class<?> payClass = Class.forName(type);
        Constructor<?> payConstructor = payClass.getConstructor(double.class);
        
        return (AbstractPay) payConstructor.newInstance(balance);
    }
}
