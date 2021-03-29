package abstractFactoryPattern.abstractFactoryPattern1;

public class Client
{
    public static void main(String[] args)
    {
        EFactory factory;
        Television tv;
        AirConditioner ac;
        factory = new HaierFactory();
        tv = factory.produceTelevision();
        ac = factory.produceAirConditioner();
        tv.play();
        ac.changeTemperature();
    }
}
