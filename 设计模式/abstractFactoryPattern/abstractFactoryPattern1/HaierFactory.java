package 设计模式.abstractFactoryPattern.abstractFactoryPattern1;

public class HaierFactory implements EFactory
{
    
    @Override
    public Television produceTelevision()
    {
        return new HaierTelevision();
    }
    
    @Override
    public AirConditioner produceAirConditioner()
    {
        return new HaierAirConditioner();
    }
}
