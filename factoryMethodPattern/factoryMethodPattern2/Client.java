package factoryMethodPattern.factoryMethodPattern2;

public class Client
{
    public static void main(String[] args)
    {
        Log log;
        LogFactory logFactory;
        logFactory = new DatabaseLogFactory();
        log = logFactory.createLog();
        log.writeLog();
    }
}
