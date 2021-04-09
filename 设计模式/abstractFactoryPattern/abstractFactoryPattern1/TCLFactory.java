package 设计模式.abstractFactoryPattern.abstractFactoryPattern1;

public class TCLFactory implements EFactory
{
    @Override
    public Television produceTelevision()
    {
        return new TCLTelevision();
    }
    
    @Override
    public AirConditioner produceAirConditioner()
    {
        return new TCLAirConditioner();
    }
}
