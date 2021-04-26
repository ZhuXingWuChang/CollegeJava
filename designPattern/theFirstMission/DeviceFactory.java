package designPattern.theFirstMission;

import java.util.ArrayList;

public class DeviceFactory
{
    private ArrayList<NetworkDevice> devices = new ArrayList<>();
    private int totalTerminal = 0;
    
    public DeviceFactory()
    {
        NetworkDevice nd1 = new Switch("Cusci-WS-C2950-24");
        devices.add(nd1);
        NetworkDevice nd2 = new Hub("TP-LINK-HF8M");
        devices.add(nd2);
    }
    
    public NetworkDevice getNetWorkDevice(String type)
    {
        if (type.equalsIgnoreCase("cisco"))
        {
            totalTerminal++;
            return (NetworkDevice) devices.get(0);
        }
        else if (type.equalsIgnoreCase("tp"))
        {
            totalTerminal++;
            return (NetworkDevice) devices.get(1);
        }
        else
        {
            return null;
        }
    }
    
    public NetworkDevice buyASameDevice(String type) throws CloneNotSupportedException
    {
        if (type.equalsIgnoreCase("cisco"))
        {
            NetworkDevice device = (NetworkDevice) devices.get(0).clone();
            devices.add(device);
            return device;
        }
        else if (type.equalsIgnoreCase("tp"))
        {
            NetworkDevice device = (NetworkDevice) devices.get(1).clone();
            devices.add(device);
            return device;
        }
        else
        {
            return null;
        }
    }
    
    public int getTotalDevice()
    {
        return devices.size();
    }
    
    public int getTotalTerminal()
    {
        return totalTerminal;
    }
}
