package designPatterns.simpleFactoryPattern1.bad;

public class PaySystem
{
    private double money;
    
    public void pay(String type)
    {
        if (type.equalsIgnoreCase("cash"))
        {
            //现金支付处理代码
        } else if (type.equalsIgnoreCase("creditcard"))
        {
            //信用卡支付处理代码
        } else if (type.equalsIgnoreCase("voucher"))
        {
            //代金券支付处理代码
        }
    }
}
