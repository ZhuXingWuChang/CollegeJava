package 设计模式.bridgePattern.bridgePattern2;

public class Client
{
    public static void main(String[] args)
    {
        OperatingSystemVersion osv;
        VideoFile vf;
        
        vf = new WMVFile();
        osv = new WindowsVersion();
        
        osv.setVideoFile(vf);
        osv.vf.decode(osv.getOsType(), "蓝蓝路");
        osv.play("蓝蓝路");
    }
}
