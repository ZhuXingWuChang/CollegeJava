package designPattern.decoratorPattern.decoratorPattern2;

public class AdvancedCipher extends CipherDecorator
{
    public AdvancedCipher(Cipher cipher)
    {
        super(cipher);
    }
    
    @Override
    public String encrypt(String plainText)
    {
        String result = super.encrypt(plainText);
        result = mod(result);
        return super.encrypt(plainText);
    }
    
    public String mod(String text)
    {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < text.length(); i++)
        {
            String c = String.valueOf(text.charAt(i) % 6);
            str.append(c);
        }
        return str.toString();
    }
}
