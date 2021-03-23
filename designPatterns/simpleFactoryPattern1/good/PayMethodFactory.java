package designPatterns.simpleFactoryPattern1.good;

public class PayMethodFactory
{
    public static AbstractPay getPayMethod(double balance, String type)
    {
        if (type.equalsIgnoreCase("cash"))
        {
            return new CashPay(balance);   // 根据参数创建具体产品
        }
        else if (type.equalsIgnoreCase(("creditcard")))
        {
            return new CreditcardPay(balance);
        }
        else if (type.equalsIgnoreCase("voucher"))
        {
            return new VoucherPay(balance);
        }
        else
            return null;
    }
}
