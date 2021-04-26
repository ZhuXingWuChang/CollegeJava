package designPattern.abstractFactoryPattern.abstractFactoryPattern2;

public class OracleFactory implements DBFactory
{
    
    @Override
    public Connection createConnection()
    {
        return new OracleConnection();
    }
    
    @Override
    public Statement createStatement()
    {
        return new OracleStatement();
    }
}
