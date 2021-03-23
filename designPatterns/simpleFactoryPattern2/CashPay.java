package designPatterns.simpleFactoryPattern2;

public class CashPay extends AbstractPay
{
    private double cashMoney;
    
    public CashPay(double balance)
    {
        cashMoney = balance;
    }
    
    @Override
    public void pay(double price)
    {
        if (price < cashMoney)
            cashMoney -= price;
        else
            System.out.println("金额异常，购买失败");
    }
    
    @Override
    public double getBalance()
    {
        return cashMoney;
    }
}
