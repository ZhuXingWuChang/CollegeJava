package 设计模式.bridgePattern;

public class Blue implements Color
{
    public void bepaint(String penType, String name)
    {
        System.out.println(penType + "蓝色的" + name + ".");
    }
}
