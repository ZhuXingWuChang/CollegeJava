package designPattern.bridgePattern.bridgePattern1;

public class Blue implements Color
{
    public void bepaint(String penType, String name)
    {
        System.out.println(penType + "蓝色的" + name + ".");
    }
}
