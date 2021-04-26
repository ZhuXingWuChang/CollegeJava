package designPattern.simpleFactoryPattern.simpleFactoryPattern4;

public class Client
{
    public static void main(String[] args) throws UnSupportedShapeException
    {
        Graphics[] graphics = new Graphics[4];
        graphics[0] = GraphicsFactory.newGraphics("circle");
        graphics[1] = GraphicsFactory.newGraphics("rectangle");
        graphics[2] = GraphicsFactory.newGraphics("triangle");
//        graphics[3] = GraphicsFactory.newGraphics("line");
        for (int i = 0; i < 3; i++)
        {
            graphics[i].draw();
            graphics[i].erase();
        }
    }
}
