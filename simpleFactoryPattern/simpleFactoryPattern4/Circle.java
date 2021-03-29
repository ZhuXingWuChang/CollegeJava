package simpleFactoryPattern.simpleFactoryPattern4;

public class Circle implements Graphics
{
    @Override
    public void draw()
    {
        System.out.println("画一个圆!");
    }
    
    @Override
    public void erase()
    {
        System.out.println("擦掉圆!");
    }
}
