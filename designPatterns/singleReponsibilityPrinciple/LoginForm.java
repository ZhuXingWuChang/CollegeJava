package designPatterns.singleReponsibilityPrinciple;

public class LoginForm
{
    private UserDAO dao;
    
    public void init()
    {
        System.out.println("(操作：按下初始化按钮)");
        dao = new UserDAO();
        System.out.println("*显示：已初始化用户信息*");
    }
    
    public void display()
    {
        System.out.println("(操作：按下显示信息按钮)");
        System.out.println("*显示：用户信息为:*\n*姓名:张三  国籍:中国  资产:20000￥*");
    }
    
    public void validate()
    {
        System.out.println("(操作：按下信息核实按钮)");
        dao.findUser("张三", "123456");
        System.out.println("*显示：经核实，用户存在*");
    }
}
