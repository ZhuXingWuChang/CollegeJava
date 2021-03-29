package abstractFactoryPattern.abstractFactoryPattern2;

public class MySQLStatement implements Statement
{
    @Override
    public void statementOperator()
    {
        System.out.println("MySQL语句操作生效中……");
    }
}
