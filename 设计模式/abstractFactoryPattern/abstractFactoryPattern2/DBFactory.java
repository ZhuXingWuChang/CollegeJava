package 设计模式.abstractFactoryPattern.abstractFactoryPattern2;

public interface DBFactory
{
    public Connection createConnection();
    public Statement createStatement();
}
