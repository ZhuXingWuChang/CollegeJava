package designPattern.singleReponsibilityPrinciple;

public class MainClass
{
    public static void main(String[] args)
    {
        LoginForm view = new LoginForm();
        view.init();
        view.display();
        view.validate();
    }
}
