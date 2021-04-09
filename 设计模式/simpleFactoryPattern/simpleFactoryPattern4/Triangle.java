package 设计模式.simpleFactoryPattern.simpleFactoryPattern4;

public class Triangle implements Graphics
{
    
    @Override
    public void draw()
    {
        System.out.println("画一个三角形!");
    }
    
    @Override
    public void erase()
    {
        System.out.println("擦掉三角形!");
    }
}
