package designPattern.theFirstMission;

public class Switch implements NetworkDevice, Cloneable
{
    private String type;
    
    public Switch(String type)
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
        System.out.println("通过交换机连接,交换机类型为" + this.type);
    }
    
    @Override
    public NetworkDevice clone() throws CloneNotSupportedException
    {
        return (NetworkDevice) super.clone();
    }
}
