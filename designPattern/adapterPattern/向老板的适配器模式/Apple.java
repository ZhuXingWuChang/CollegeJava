package designPattern.adapterPattern.向老板的适配器模式;

public class Apple extends MyFruit
{
    public Apple()
    {
        this.fruitType = "Apple";
    }
    
    @Override
    public String getFruitType()
    {
        return this.fruitType;
    }
}
