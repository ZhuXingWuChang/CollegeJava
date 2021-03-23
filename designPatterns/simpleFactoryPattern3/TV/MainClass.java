package designPatterns.simpleFactoryPattern3.TV;

public class MainClass
{
    public static void main(String[] args) throws Exception
    {
        TV television1 = TVFactory.produceTV("Haier");
        TV television2 = TVFactory.produceTV("Hisense");
    }
}
