package 设计模式.factoryMethodPattern.factoryMethodPattern2;

public class DatabaseLog implements Log
{
    @Override
    public void writeLog()
    {
        System.out.println("写数据库日志");
    }
}
