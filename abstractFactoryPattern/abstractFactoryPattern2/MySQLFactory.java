package abstractFactoryPattern.abstractFactoryPattern2;

public class MySQLFactory implements DBFactory
{
    
    @Override
    public Connection createConnection()
    {
        return new MySQLConnection();
    }
    
    @Override
    public Statement createStatement()
    {
        return new MySQLStatement();
    }
}
