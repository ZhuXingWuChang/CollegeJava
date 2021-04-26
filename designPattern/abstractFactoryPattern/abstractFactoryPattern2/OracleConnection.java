package designPattern.abstractFactoryPattern.abstractFactoryPattern2;

public class OracleConnection implements Connection
{
    @Override
    public void connect()
    {
        System.out.println("Oracle数据库正在连接……");
    }
}
