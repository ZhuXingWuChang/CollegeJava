package corejava1.chapter6.lambda;

/**
 * This is my program, it's doesn't come from book. It's come from 尚硅谷.
 *
 * @author ZhuXingWuChang.
 */
public class FilterEmployeeByAge implements MyPredicate<Employee>
{
    @Override
    public boolean test(Employee t)
    {
        return t.getAge() >= 35;
    }
}
