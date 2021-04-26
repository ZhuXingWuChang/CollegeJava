package designPattern.factoryMethodPattern.factoryMethodPattern2;

public class FileLogFactory implements LogFactory
{
    @Override
    public Log createLog()
    {
        System.out.println("生产文件日志");
        return new FileLog();
    }
}
