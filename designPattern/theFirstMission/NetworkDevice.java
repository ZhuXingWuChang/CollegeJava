package designPattern.theFirstMission;

public interface NetworkDevice extends Cloneable
{
    public String getType();
    
    public void use();
    
    public NetworkDevice clone() throws CloneNotSupportedException;
}
