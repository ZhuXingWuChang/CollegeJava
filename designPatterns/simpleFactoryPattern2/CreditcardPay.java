package designPatterns.simpleFactoryPattern2;

public class CreditcardPay extends AbstractPay
{
    private double moneyInTheCreditcard;
    
    public CreditcardPay(double balance)
    {
        moneyInTheCreditcard = balance;
    }
    
    @Override
    public void pay(double price)
    {
        if (price < moneyInTheCreditcard)
            moneyInTheCreditcard -= price;
        else
            System.out.println("金额异常，购买失败");
    }
    
    @Override
    public double getBalance()
    {
        return moneyInTheCreditcard;
    }
}
