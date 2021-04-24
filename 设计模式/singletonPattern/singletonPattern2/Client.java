package 设计模式.singletonPattern.singletonPattern2;

public class Client
{
    public static void main(String[] args)
    {
        PrintSpoolerSingleton ps1, ps2;
        try
        {
            ps1 = PrintSpoolerSingleton.getInstance();
            ps1.manageJobs();
        }
        catch (PrintSpoolerException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("----------------------------");
        try
        {
            ps2 = PrintSpoolerSingleton.getInstance();
            ps2.manageJobs();
        }
        catch (PrintSpoolerException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
