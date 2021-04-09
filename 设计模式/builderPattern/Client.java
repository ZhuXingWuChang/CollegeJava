package 设计模式.builderPattern;

public class Client
{
    public static void main(String[] args)
    {
        MealBuilder mb = new SubMealBuilderA(); // 一个汉堡套餐(建造者)
        KFCWaiter waiter = new KFCWaiter(); // 一个服务员(指挥者)
        waiter.setMealBuilder(mb);  // 把具体的建造对象给指挥者
        Meal meal = waiter.construct(); // 指挥者来负责对象的建造逻辑
        
        System.out.println("套餐组成: ");
        System.out.println(meal.getFood());
        System.out.println(meal.getDrink());
    }
}
