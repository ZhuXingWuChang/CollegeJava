package designPattern.decoratorPattern.decoratorPattern2;

public class ComplexCipher extends CipherDecorator
{
    public ComplexCipher(Cipher cipher)
    {
        super(cipher);
    }
    
    @Override
    public String encrypt(String plainText)
    {
        String result = super.encrypt(plainText);
        result = reverse(result);
        return result;
    }
    
    public String reverse(String text)
    {
        StringBuffer str = new StringBuffer();
        for (int i = text.length(); i > 0; i--)
            str.append(text.substring(i - 1, i));
        return str.toString();
    }
}
