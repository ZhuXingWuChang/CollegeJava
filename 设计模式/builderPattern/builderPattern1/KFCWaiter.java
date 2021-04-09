package 设计模式.builderPattern.builderPattern1;

public class KFCWaiter
{
    private MealBuilder mb;
    
    public void setMealBuilder(MealBuilder mb)
    {
        this.mb = mb;
    }
    
    public Meal construct()
    {
        mb.buildFood();
        mb.buildDrink();
        return mb.getMeal();
    }
}
