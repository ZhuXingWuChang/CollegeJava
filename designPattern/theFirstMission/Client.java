package designPattern.theFirstMission;

public class Client
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        NetworkDevice nd1, nd2, nd3, nd4, nd5, nd6, nd7;
        DeviceFactory df = new DeviceFactory();
        
        nd1 = df.getNetWorkDevice("cisco");
        nd1.use();
        
        nd2 = df.getNetWorkDevice("cisco");
        nd2.use();
        
        nd3 = df.getNetWorkDevice("cisco");
        nd3.use();
        
        nd4 = df.getNetWorkDevice("tp");
        nd4.use();
        
        nd5 = df.getNetWorkDevice("tp");
        nd5.use();
        
        nd6 = df.buyASameDevice("cisco");
        nd6.use();
        
        nd7 = df.buyASameDevice("tp");
        nd7.use();
        
        System.out.println("总的网络设备数(交换机&集线器):" + df.getTotalDevice());
        System.out.println("总的主机数:" + df.getTotalTerminal());
    }
}
