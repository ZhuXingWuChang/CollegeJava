package 设计模式.compositePattern.compositePattern2;

public class TextFile extends AbstractFile
{
    private String fileName;
    
    public TextFile(String fileName)
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
        System.out.println("Text文件\"" + fileName + "\"展示中!");
    }
}
