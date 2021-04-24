package 设计模式.bridgePattern.bridgePattern2;

public class UnixVersion extends OperatingSystemVersion
{
    private String osType = "Unix";
    
    @Override
    public void play(String fileName)
    {
        System.out.println("在Unix系统中播放文件:" + fileName);
    }
    
    public String getOsType()
    {
        return osType;
    }
}
