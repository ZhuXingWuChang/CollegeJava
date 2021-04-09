package 设计模式.factoryMethodPattern.factoryMethodPattern2;

public class FileLog implements Log
{
    @Override
    public void writeLog()
    {
        System.out.println("写文件日志");
    }
}
