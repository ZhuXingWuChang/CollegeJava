package 设计模式.prototypePattern.prototypePattern1;

public class Email implements Cloneable
{
    private Attachment attachment = null;
    private String emailTitle;
    private int emailLevel;
    
    public Email()
    {
        this.attachment = new Attachment();
        this.emailTitle = "Hello";
        this.emailLevel = 1;
    }
    
    @Override
    public Object clone()
    {
        Email clone = null;
        try
        {
            clone = (Email) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println("Clone failure");
        }
        return clone;
    }
    
    public Attachment getAttachment()
    {
        return this.attachment;
    }
    
    public String getEmailTitle()
    {
        return emailTitle;
    }
    
    public int getEmailLevel()
    {
        return emailLevel;
    }
    
    public void display()
    {
        System.out.println("查看邮件");
    }
}
