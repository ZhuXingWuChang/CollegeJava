package designPattern.adapterPattern.adapterPattern2;

public class NewCipherAdapter extends DataOperation
{
    private NewCipher cipher;
    
    public NewCipherAdapter()
    {
        cipher = new NewCipher();
    }
    
    @Override
    public String doEncrypt(int key, String ps)
    {
        return cipher.doEncrypt(key, ps);
    }
}
