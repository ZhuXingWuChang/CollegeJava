package designPattern.mementoPattern.dp;

public class Controller
{
    private AbstractCommand restoreCommand;
    
    public Controller(AbstractCommand restoreCommand)
    {
        this.restoreCommand = restoreCommand;
    }
    
    public void restore(Memento m)
    {
        restoreCommand.execute(m);
    }
}
