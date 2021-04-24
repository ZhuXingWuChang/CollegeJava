package 设计模式.adapterPattern.向老板的适配器模式;

public class Adapter extends OldJuicer implements InewJuicer
{
    @Override
    public String newPort(MyFruit fruit1, MyFruit fruit2)
    {
        String str = "混合果汁:" + onePort(fruit1) + onePort(fruit2);
        return str;
    }
}
