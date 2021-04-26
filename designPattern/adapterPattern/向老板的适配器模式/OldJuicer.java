package designPattern.adapterPattern.向老板的适配器模式;

public class OldJuicer
{
    public String onePort(MyFruit fruit)
    {
        String str = fruit.getFruitType() + "果汁.";
        return str;
    }
}
