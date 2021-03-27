package designPatterns.simpleFactoryPattern3.TV;

public class Client
{
    public static void main(String[] args) throws Exception
    {
        try
        {
            TV tv;  // 抽象类型定义
            String brandName = XMLUtilTV.getBrandName();
            tv = TVFactory.produceTV(brandName);
            tv.play();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
