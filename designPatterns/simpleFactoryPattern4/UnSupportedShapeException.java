package designPatterns.simpleFactoryPattern4;

public class UnSupportedShapeException extends Exception
{
    public UnSupportedShapeException()
    {
    }
    
    @Override
    public String toString()
    {
        return "不支持生产该类型！";
    }
}
