package 设计模式.adapterPattern.向老板的适配器模式;

public class Banana extends MyFruit
{
    public Banana()
    {
        this.fruitType = "Banana";
    }
    
    @Override
    public String getFruitType()
    {
        return this.fruitType;
    }
}
