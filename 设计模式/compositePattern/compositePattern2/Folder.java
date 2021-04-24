package 设计模式.compositePattern.compositePattern2;

import java.util.ArrayList;

public class Folder extends AbstractFile
{
    private ArrayList<AbstractFile> fileList = new ArrayList<>();
    private String fileName;
    
    public Folder(String fileName)
    {
        this.fileName = fileName;
    }
    
    @Override
    public void add(AbstractFile element)
    {
        fileList.add(element);
    }
    
    @Override
    public void remove(AbstractFile element)
    {
        fileList.remove(element);
    }
    
    @Override
    public void display()
    {
        for (AbstractFile file : fileList)
            file.display();
    }
}
