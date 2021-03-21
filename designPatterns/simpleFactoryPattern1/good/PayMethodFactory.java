package designPatterns.simpleFactoryPattern1.good;

public class PayMethodFactory
{
    public static AbstractPay getPayMethod(String type)
    {
        if (type.equalsIgnoreCase("cash"))
        {
            return new CashPay();   // 根据参数创建具体产品
        } else if (type.equalsIgnoreCase(("creditcard")))
        {
            return new CreditcardPay();
        } else if (type.equalsIgnoreCase("voucher"))
        {
            return new VoucherPay();
        }else
            return null;
    }
}
