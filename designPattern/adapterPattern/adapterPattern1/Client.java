package designPattern.adapterPattern.adapterPattern1;

public class Client
{
    public static void main(String[] args)
    {
        Robot robot = new DogAdapter();
        robot.cry();
        robot.move();
        
        Robot newRobot = new BirdAdapter();
        newRobot.cry();
        newRobot.move();
    }
}
