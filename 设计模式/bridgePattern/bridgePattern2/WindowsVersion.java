package 设计模式.bridgePattern.bridgePattern2;

public class WindowsVersion extends OperatingSystemVersion
{
    private String osType = "Windows";
    
    @Override
    public void play(String fileName)
    {
        System.out.println("在Windows系统中播放文件:" + fileName);
    }
    
    public String getOsType()
    {
        return osType;
    }
}
