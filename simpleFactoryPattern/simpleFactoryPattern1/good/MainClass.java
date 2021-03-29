package simpleFactoryPattern.simpleFactoryPattern1.good;

public class MainClass
{
    public static void main(String[] args)
    {
        double allMyMoney;
        
        AbstractPay ap1 = PayMethodFactory.getPayMethod(2000, "cash");
        AbstractPay ap2 = PayMethodFactory.getPayMethod(10000, "creditcard");
        AbstractPay ap3 = PayMethodFactory.getPayMethod(500, "voucher");
        allMyMoney = ap1.getBalance() + ap2.getBalance() + ap3.getBalance();
        System.out.println("Before, all your money: " + allMyMoney);
        
        ap1.pay(198);
        ap2.pay(8880);
        ap3.pay(0);
        allMyMoney = ap1.getBalance() + ap2.getBalance() + ap3.getBalance();
        System.out.println("After, all your money: " + allMyMoney);
    }
}
