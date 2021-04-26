package designPattern.theFirstMission;

public class Hub implements NetworkDevice, Cloneable
{
    private String type;
    
    public Hub(String type)
    {
        this.type = type;
    }
    
    @Override
    public String getType()
    {
        return this.type;
    }
    
    @Override
    public void use()
    {
        System.out.println("通过集线器连接,交换机类型为" + this.type);
    }
    
    @Override
    public NetworkDevice clone() throws CloneNotSupportedException
    {
        return (NetworkDevice) super.clone();
    }
}
