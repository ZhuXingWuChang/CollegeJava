package 设计模式.compositePattern.compositePattern2;

public class VideoFile extends AbstractFile
{
    private String fileName;
    
    public VideoFile(String fileName)
    {
        this.fileName = fileName;
    }
    
    @Override
    public void add(AbstractFile element)
    {
        System.err.println("非法操作");
    }
    
    @Override
    public void remove(AbstractFile element)
    {
        System.err.println("非法操作");
    }
    
    @Override
    public void display()
    {
        System.out.println("Video文件\"" + fileName + "\"播放中!");
    }
}
