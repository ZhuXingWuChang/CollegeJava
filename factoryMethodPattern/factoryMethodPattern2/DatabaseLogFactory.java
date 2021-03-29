package factoryMethodPattern.factoryMethodPattern2;

public class DatabaseLogFactory implements LogFactory
{
    @Override
    public Log createLog()
    {
        System.out.println("生产数据库日志");
        return new DatabaseLog();
    }
}
