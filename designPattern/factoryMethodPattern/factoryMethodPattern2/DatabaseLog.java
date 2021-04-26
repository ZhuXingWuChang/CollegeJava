package designPattern.factoryMethodPattern.factoryMethodPattern2;

public class DatabaseLog implements Log
{
    @Override
    public void writeLog()
    {
        System.out.println("写数据库日志");
    }
}
