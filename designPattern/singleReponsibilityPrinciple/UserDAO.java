package designPattern.singleReponsibilityPrinciple;

public class UserDAO
{
    private DBUtil db = new DBUtil();
    
    public boolean findUser(String userName, String userPassword)
    {
        db.getConnection();
        System.out.println("(后台：在数据库中找到了用户)");
        return true;
    }
}
