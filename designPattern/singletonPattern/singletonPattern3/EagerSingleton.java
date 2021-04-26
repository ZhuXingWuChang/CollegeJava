package designPattern.singletonPattern.singletonPattern3;

public class EagerSingleton
{
    private static final EagerSingleton instance = new EagerSingleton();
    
    private EagerSingleton()
    {
    }
    
    private static EagerSingleton getInstance()
    {
        return instance;
    }
}
