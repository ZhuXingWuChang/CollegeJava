package 设计模式.bridgePattern.bridgePattern2;

public class LinuxVersion extends OperatingSystemVersion
{
    private String osType = "Linux";
    
    @Override
    public void play(String fileName)
    {
        System.out.println("在Linux系统中播放文件:" + fileName);
    }
    
    public String getOsType()
    {
        return osType;
    }
}
