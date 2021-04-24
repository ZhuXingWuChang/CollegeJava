package 设计模式.bridgePattern.bridgePattern2;

public abstract class OperatingSystemVersion
{
    protected VideoFile vf;
    
    public void setVideoFile(VideoFile vf)
    {
        this.vf = vf;
    }
    
    public abstract void play(String fileName);
    
    public abstract String getOsType();
}
