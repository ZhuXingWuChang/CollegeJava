package designPattern.simpleFactoryPattern.simpleFactoryPattern1.good;

public class VoucherPay extends AbstractPay
{
    private double moneyInTheVoucher;
    
    public VoucherPay(double balance)
    {
        moneyInTheVoucher = balance;
    }
    
    @Override
    public void pay(double price)
    {
        if (price < moneyInTheVoucher)
            moneyInTheVoucher -= price;
        else
            System.out.println("金额异常，购买失败");
    }
    
    @Override
    public double getBalance()
    {
        return moneyInTheVoucher;
    }
}
