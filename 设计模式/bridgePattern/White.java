package 设计模式.bridgePattern;

public class White implements Color
{
    public void bepaint(String penType, String name)
    {
        System.out.println(penType + "白色的" + name + ".");
    }
}
