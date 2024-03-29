package designPattern.compositePattern.compositePattern2;

public class ImageFile extends AbstractFile
{
    private String fileName;
    
    public ImageFile(String fileName)
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
        System.out.println("Image文件\"" + fileName + "\"展示中!");
    }
}
