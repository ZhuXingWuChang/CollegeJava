package designPattern.bridgePattern.bridgePattern1;

public class Client
{
    public static void main(String[] args)
    {
        Color color;
        Pen pen;
        
        color = new Blue();
        pen = new BigPen();
        pen.setColor(color);
        pen.draw("梨花香");
    }
}
