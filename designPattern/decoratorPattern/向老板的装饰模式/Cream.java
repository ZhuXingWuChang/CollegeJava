package designPattern.decoratorPattern.向老板的装饰模式;

public class Cream extends Decorating
{
    public Cream(BirthdayCake birthdayCake)
    {
        super(birthdayCake);
    }
    
    public void putCream()
    {
        System.out.println("加上奶油...");
    }
}
