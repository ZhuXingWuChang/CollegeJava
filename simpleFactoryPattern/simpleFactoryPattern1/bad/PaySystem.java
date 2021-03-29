package simpleFactoryPattern.simpleFactoryPattern1.bad;

public class PaySystem
{
    private double allMyMoney;
    private double moneyInTheCreditcard;
    private double moneyInTheVoucher;
    
    public PaySystem(double balance, double creditcardBalance, double voucherBalance)
    {
        moneyInTheCreditcard = creditcardBalance;
        moneyInTheVoucher = voucherBalance;
        allMyMoney += balance + creditcardBalance + voucherBalance;
    }
    
    public void setAllMyMoney(double allMyMoney)
    {
        this.allMyMoney = allMyMoney;
    }
    
    public void setMoneyInTheCreditcard(double moneyInTheCreditcard)
    {
        this.moneyInTheCreditcard = moneyInTheCreditcard;
    }
    
    public void setMoneyInTheVoucher(double moneyInTheVoucher)
    {
        this.moneyInTheVoucher = moneyInTheVoucher;
    }
    
    public void pay(double price, String type)
    {
        if (type.equalsIgnoreCase("cash"))
        {
            cashPay(price);
        }
        else if (type.equalsIgnoreCase("creditcard"))
        {
            creditcardPay(price);
        }
        else if (type.equalsIgnoreCase("voucher"))
        {
            voucherPay(price);
        }
    }
    
    private void cashPay(double price)
    {
        if (price < allMyMoney)
            allMyMoney -= price;
        else
            System.out.println("金额异常，购买失败");
    }
    
    private void creditcardPay(double price)
    {
        if (price < allMyMoney && price < moneyInTheCreditcard)
        {
            allMyMoney -= price;
            moneyInTheCreditcard -= price;
        }
        else
            System.out.println("金额异常，购买失败");
    }
    
    private void voucherPay(double price)
    {
        if (price < allMyMoney && price < moneyInTheVoucher)
        {
            allMyMoney -= price;
            moneyInTheVoucher -= price;
        }
        else
            System.out.println("金额异常，购买失败");
    }
    
    @Override
    public String toString()
    {
        return "PaySystem{" +
                "allMyMoney=" + allMyMoney +
                ", moneyInTheCreditcard=" + moneyInTheCreditcard +
                ", moneyInTheVoucher=" + moneyInTheVoucher +
                '}';
    }
    
    public static void main(String[] args)
    {
        PaySystem ps = new PaySystem(2000, 10000, 500);
        ps.pay(198, "cash");
        ps.pay(8880, "creditcard");
        System.out.println(ps.toString());
    }
}
