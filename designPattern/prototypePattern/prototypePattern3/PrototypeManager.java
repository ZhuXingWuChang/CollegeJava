package designPattern.prototypePattern.prototypePattern3;

import java.util.Hashtable;

public class PrototypeManager
{
    private Hashtable ht = new Hashtable();
    
    public PrototypeManager()
    {
        ht.put("red", new Red());
        ht.put("blue", new Blue());
    }
    
    public void addColor(String key, MyColor obj)
    {
        ht.put(key, obj);
    }
    
    public MyColor getColor(String key)
    {
        return (MyColor) ((MyColor) ht.get(key)).clone();
    }
}
