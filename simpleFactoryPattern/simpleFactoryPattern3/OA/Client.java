package simpleFactoryPattern.simpleFactoryPattern3.OA;

public class Client
{
    public static void main(String[] args)
    {
        try
        {
            
            User user;
            UserDAO userDao = new UserDAO();    // 用UserDAO类来模拟一个用户信息数据库
            int permission = userDao.findPermission("zhangsan", "123456");
            user = UserFactory.getUser(permission);
            user.sameOperation();
            user.diffOperation();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
