package designPattern.decoratorPattern.向老板的装饰模式;

public class Cake implements BirthdayCake
{
    public Cake()
    {
        System.out.println("做好一个没有任何装饰的蛋糕");
    }
    
    public void show()
    {
        System.out.println("show:蛋糕胚");
    }
}
