package corejava1.chapter6.lambda;

/**
 * This is my program, it's doesn't come from book. It's come from 尚硅谷.
 *
 * @author ZhuXingWuChang.
 */
@FunctionalInterface
public interface MyPredicate<T>
{
    public boolean test(T t);
}
