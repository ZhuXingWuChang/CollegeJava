package 设计模式.adapterPattern.defaultAdapterPattern;

public class ConcreteServiceClass extends AbstractServiceClass
{
    @Override
    public void serviceMethod1()
    {
        System.out.println("具体业务方法一");
    }
    
    @Override
    public void serviceMethod3()
    {
        System.out.println("具体业务方法三");
    }
}
