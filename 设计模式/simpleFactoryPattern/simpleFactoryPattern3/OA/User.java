package 设计模式.simpleFactoryPattern.simpleFactoryPattern3.OA;

public abstract class User
{
    public void sameOperation()
    {
        System.out.println("修改个人资料!");
    }
    
    public abstract void diffOperation();
}
