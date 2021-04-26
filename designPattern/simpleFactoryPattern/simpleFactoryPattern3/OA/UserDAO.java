package designPattern.simpleFactoryPattern.simpleFactoryPattern3.OA;

public class UserDAO
{
    public int findPermission(String userName, String userPassword)
    {
        if ("zhangsan" == userName && "123456" == userPassword)
        {
            return 0;
        }
        else
        {
            return -1;  // 如果错误,则返回-1
        }
    }
}
