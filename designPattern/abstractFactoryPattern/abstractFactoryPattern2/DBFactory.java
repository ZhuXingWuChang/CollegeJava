package designPattern.abstractFactoryPattern.abstractFactoryPattern2;

public interface DBFactory
{
    public Connection createConnection();
    public Statement createStatement();
}
