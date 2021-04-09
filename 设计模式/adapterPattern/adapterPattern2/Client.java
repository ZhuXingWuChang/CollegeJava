package 设计模式.adapterPattern.adapterPattern2;

public class Client
{
    public static void main(String[] args)
    {
        DataOperation dao = new CipherAdapter();
        dao.setPassword("sunnyLiu");
        String ps = dao.getPassword();
        String es = dao.doEncrypt(6, ps);
        System.out.println("明文为: " + ps);
        System.out.println("密文为: " + es);
        
        DataOperation newDAO = new NewCipherAdapter();
        newDAO.setPassword("sunnyLiu");
        String newPs = newDAO.getPassword();
        String newEs = newDAO.doEncrypt(6, newPs);
        System.out.println("新加密的密文为: " + newEs);
    }
}
