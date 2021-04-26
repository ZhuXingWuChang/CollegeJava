package designPattern.decoratorPattern.decoratorPattern2;

public class Client
{
    public static void main(String[] args)
    {
        String password = "sunnyLiu"; //明文
        String cpassword;
        Cipher sc, cc;
        
        sc = new SimpleCipher();
        cpassword = sc.encrypt(password);
        System.out.println(cpassword);
        System.out.println("---------------------");
        
        cc = new ComplexCipher(sc);
        cpassword = cc.encrypt(password);
        System.out.println(cpassword);
        System.out.println("---------------------");
    }
}
