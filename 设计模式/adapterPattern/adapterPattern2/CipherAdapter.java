package 设计模式.adapterPattern.adapterPattern2;

public class CipherAdapter extends DataOperation
{
    private Caesar cipher;
    
    public CipherAdapter()
    {
        cipher = new Caesar();
    }
    
    @Override
    public String doEncrypt(int key, String ps)
    {
        return cipher.doEncrypt(key, ps);
    }
}
