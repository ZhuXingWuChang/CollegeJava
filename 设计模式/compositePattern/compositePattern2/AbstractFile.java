package 设计模式.compositePattern.compositePattern2;

public abstract class AbstractFile
{
    public abstract void add(AbstractFile element);
    
    public abstract void remove(AbstractFile element);
    
    public abstract void display();
}
