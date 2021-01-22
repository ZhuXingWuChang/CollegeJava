package corejava1.chapter5.objectAnalyzer;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class ObjectAnalyzer
{
    private ArrayList<Object> visited = new ArrayList<>();
    
    /**
     * Converts an object to a string representation that lists all fields.
     * (将对象转换为列出所有字符串的表现形式)
     *
     * @param obj an object
     * @return a string with the object's class name and all field names and values
     */
    public String toString(Object obj)
            throws ReflectiveOperationException
    {
        // 空引用则返回字符串"null"
        if (obj == null) return "null";
        // ArrayList的Contains方法，如果此列表中包含指定的元素，则返回true
        // 所以这里如果List里包含obj，那么返回字符串"..."
        if (visited.contains(obj)) return "...";
        // 到这里，obj既不是空，也不是列表里包含的Element(元素)，所以把obj添加到列表里
        visited.add(obj);
        // 用cl保存obj的类型信息
        Class cl = obj.getClass();
        // 如果obj是一个String对象，那么返回字符串obj
        if (cl == String.class) return (String) obj;
        // 到这里，obj非空、不是List里的元素、不是String
        // Class类的isArray方法，如果Class对象是一个数组类，返回true，值得一提的是，ArrayList并不属于数组类
        if (cl.isArray())
        {
            /*
            Class类的getComponentType方法，返回表示隐式参数的数组组件类型的Class，如果隐式参数不是数组类，返回null
            数组组件可以理解成数组组成类型，int[]的数组组件是int，int[][]的数组组件是int[]
            */
            // 这里的字符串r是为了保存接下来的各种元素信息
            String r = cl.getComponentType() + "[]{";
            for (int i = 0; i < Array.getLength(obj); i++)
            {
                // 用","隔开数组元素
                if (i > 0) r += ",";
                // 返回obj对象中第i个组件的值
                Object val = Array.get(obj, i);
                // 判断数组组件（数组组成成分）的类型是否是原始类型（基本类型或者其对应的包装类型），如果是则接在字符串r后
                if (cl.getComponentType().isPrimitive()) r += val;
                    // 否则将递归调用自己？？？？？
                else r += toString(val);
            }
            // 至此为止，每个元素已经遍历完成，并且它们的信息都被添加到了字符串r当中，然后我们返回这个字符串
            return r + "}";
        }
        
        /*
        以上是针对数组的情况，因为数组本身也是一个对象，下面分析不是数组的情况
         */
        
        String r = cl.getName();
        // inspect the fields of this class and all superclasses(检查这个类和所有超类的字段)
        do
        {
            r += "[";
            // 得到类中所有字段，返回这些字段所构成的一个数组
            Field[] fields = cl.getDeclaredFields();
            // 这是一个便利方法，用于设置一个对象数组的可访问标志
            AccessibleObject.setAccessible(fields, true);
            // get the names and values of all fields(获取所有字段的名称和值)
            for (Field f : fields)
            {
                // 如果不是静态字段
                if (!Modifier.isStatic(f.getModifiers()))
                {
                    // String的endsWith方法测试该字符串是否以指定的后缀结束
                    // 如果字符串没有以[结尾，那么
                    if (!r.endsWith("[")) r += ",";
                    // 获取字段名，并且接上一个=
                    r += f.getName() + "=";
                    // 获取字段的类型
                    Class t = f.getType();
                    // Field类的get方法，返回obj对象中用这个Field对象描述的字段的值
                    Object val = f.get(obj);
                    if (t.isPrimitive()) r += val;
                    else r += toString(val);
                }
            }
            r += "]";
            cl = cl.getSuperclass();
        }
        while (cl != null);
        
        return r;
    }
}
