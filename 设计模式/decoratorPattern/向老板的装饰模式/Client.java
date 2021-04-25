package 设计模式.decoratorPattern.向老板的装饰模式;

public class Client
{
    public static void main(String[] args)
    {
        BirthdayCake birthdayCake = new Cake();
        birthdayCake.show();
        
        Cream cream = new Cream(birthdayCake);
        cream.putCream();
        cream.show();
        
        Fruit fruit = new Fruit(birthdayCake);
        fruit.putFruit();
        fruit.show();
    }
}
