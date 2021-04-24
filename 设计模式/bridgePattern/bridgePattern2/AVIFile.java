package 设计模式.bridgePattern.bridgePattern2;

public class AVIFile implements VideoFile
{
    @Override
    public void decode(String osType, String fileName)
    {
        System.out.println("在" + osType + "系统中,将文件" + fileName + "解码为AVI");
    }
}
