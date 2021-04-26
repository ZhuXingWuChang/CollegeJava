package designPattern.abstractFactoryPattern.abstractFactoryPattern2;

public class OracleStatement implements Statement
{
    @Override
    public void statementOperator()
    {
        System.out.println("Oracle语句操作生效中……");
    }
}
