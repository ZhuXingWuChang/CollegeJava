package designPattern.decoratorPattern.向老板的装饰模式;

public class Decorating implements BirthdayCake
{
    private BirthdayCake birthdayCake;
    
    public Decorating(BirthdayCake birthdayCake)
    {
        this.birthdayCake = birthdayCake;
    }
    
    public void show()
    {
        birthdayCake.show();
    }
}
