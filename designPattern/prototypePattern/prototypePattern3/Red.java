package designPattern.prototypePattern.prototypePattern3;

public class Red implements MyColor
{
    @Override
    public Object clone()
    {
        Red r = null;
        try
        {
            r = (Red) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
        
        }
        return r;
    }
    
    @Override
    public void display()
    {
        System.out.println("This is Red!");
    }
}
