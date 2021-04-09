package 设计模式.prototypePattern.prototypePattern1;

public class Client
{
    public static void main(String[] args)
    {
        Email email, copyEmail;
        
        email = new Email();
        
        copyEmail = (Email) email.clone();
        
        System.out.println("email==copyEmail?");
        System.out.println(email == copyEmail);
        
        System.out.println("email.getAttachment==copyEmail.getAttachment?");
        System.out.println(email.getAttachment() == copyEmail.getAttachment());
    }
}
