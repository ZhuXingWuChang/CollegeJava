package designPatterns.simpleFactoryPattern4;

public class GraphicsFactory
{
    public static Graphics newGraphics(String type)
    {
        if (type.equalsIgnoreCase("circle"))
            return new Circle();
        else if (type.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        else if (type.equalsIgnoreCase("triangle"))
            return new Triangle();
        else
            throw new UnSupportedShapeException;
    }
}
