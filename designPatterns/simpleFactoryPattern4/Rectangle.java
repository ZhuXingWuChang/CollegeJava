package designPatterns.simpleFactoryPattern4;

public class Rectangle implements Graphics
{
    @Override
    public void draw()
    {
        System.out.println("画一个矩形!");
    }
    @Override
    public void erase()
    {
        System.out.println("擦掉矩形!");
    }
}
