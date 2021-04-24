package 设计模式.bridgePattern.bridgePattern1;

public class Green implements Color
{
    public void bepaint(String penType, String name)
    {
        System.out.println(penType + "绿色的" + name + ".");
    }
}
