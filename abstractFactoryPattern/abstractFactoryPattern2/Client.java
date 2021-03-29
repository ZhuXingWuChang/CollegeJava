package abstractFactoryPattern.abstractFactoryPattern2;

public class Client
{
    public static void main(String[] args)
    {
        Connection c;
        Statement s;
        DBFactory dbFactory;
        dbFactory = new MySQLFactory();
        c = dbFactory.createConnection();
        s = dbFactory.createStatement();
        c.connect();
        s.statementOperator();
    }
}
