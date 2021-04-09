package 设计模式.factoryMethodPattern.factoryMethodPattern1;

public class HaierTVFactory implements TVFactory
{
    @Override
    public TV produceTV()
    {
        System.out.println("海尔电视及工厂生产海尔电视机。");
        return new HaierTV();
    }
}
