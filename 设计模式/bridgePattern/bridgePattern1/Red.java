package 设计模式.bridgePattern.bridgePattern1;

public class Red implements Color
{
    public void bepaint(String penType, String name)
    {
        System.out.println(penType + "红色的" + name + ".");
    }
}
