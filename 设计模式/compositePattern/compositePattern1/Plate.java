package 设计模式.compositePattern.compositePattern1;

import java.util.ArrayList;

public class Plate extends MyElement
{
    private ArrayList<MyElement> list = new ArrayList<MyElement>();
    
    public void add(MyElement element)
    {
        list.add(element);
    }
    
    public void remove(MyElement element)
    {
        list.remove(element);
    }
    
    @Override
    public void eat()
    {
        for(MyElement object:list)
            object.eat();
    }
}
