package designPattern.singletonPattern.singletonPattern4;

public class LazySingleton
{
    private static LazySingleton instance = null;
    
    private LazySingleton()
    {
    }
    
    synchronized public static LazySingleton getInstance()
    {
        if (instance == null)
            instance = new LazySingleton();
        return instance;
    }
}
