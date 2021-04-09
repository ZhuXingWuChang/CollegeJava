package 设计模式.abstractFactoryPattern.abstractFactoryPattern1;

public class TCLAirConditioner implements AirConditioner
{
    @Override
    public void changeTemperature()
    {
        System.out.println("TCL空调温度改变中……");
    }
}
