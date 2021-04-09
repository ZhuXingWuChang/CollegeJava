package 设计模式.builderPattern.builderPattern1;

public class SubMealBuilderB extends MealBuilder
{
    public void buildFood()
    {
        meal.setFood("一个鸡肉卷");
    }
    
    public void buildDrink()
    {
        meal.setDrink("一杯果汁");
    }
}
