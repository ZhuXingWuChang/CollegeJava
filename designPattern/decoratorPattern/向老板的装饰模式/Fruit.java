package designPattern.decoratorPattern.向老板的装饰模式;

public class Fruit extends Decorating
{
    public Fruit(BirthdayCake birthdayCake)
    {
        super(birthdayCake);
    }
    
    public void putFruit()
    {
        System.out.println("添加水果...");
    }
}
