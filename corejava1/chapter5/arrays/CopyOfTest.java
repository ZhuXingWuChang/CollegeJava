package corejava1.chapter5.arrays;

import java.lang.reflect.Array;

/**
 * This program demonstrates the use of reflection for manipulating arrays.
 * Java核心技术5-17
 */
public class CopyOfTest
{
    public static void main(String[] args)
    {
    
    }
    
    /**
     * This method attempts to grow an array by allocating a new array and copying all elements.
     * (该方法通过分配新数组并复制所有元素来增长数组)
     *
     * @param a         the array to grow
     * @param newLength the new length
     * @return a larger array that contains all elements of a. However, the returned
     * array has type Object[], not the same type as a
     */
    public static Object[] badCopyOf(Object[] a, int newLength) // not useful
    {
        var newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }
    
    /**
     * This method grows an array by allocating a new array of the same type and copying all elements.
     * (该方法通过分配 *相同类型的* 新数组并复制所有元素来增长数组)
     *
     * @param a the array to grow. This can be an object array or a primitive type array
     * @return a larger array that contains all elements of a.
     */
    public static Object goodCopyOf(Object a, int newLength)
    {
        Class cl = a.getClass();
        if (!cl.isArray()) return null;
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}
