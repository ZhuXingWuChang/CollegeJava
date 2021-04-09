package 设计模式.adapterPattern.adapterPattern2;

public class NewCipher
{
    public String doEncrypt(int key, String ps)
    {
        StringBuilder es = new StringBuilder();
        for (int i = 0; i < ps.length(); i++)
        {
            String c = String.valueOf(ps.charAt(i) % key);
            es.append(c);
        }
        return es.toString();
    }
}
