package designPattern.abstractFactoryPattern.abstractFactoryPattern2;

public class MySQLConnection implements Connection
{
    @Override
    public void connect()
    {
        System.out.println("MySQL数据库连接中……");
    }
}
