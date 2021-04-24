package 设计模式.compositePattern.compositePattern2;

public class Client
{
    public static void main(String[] args)
    {
        AbstractFile folder, image, video, text;
        folder = new Folder("新建文件夹");
        image = new ImageFile("图片A");
        video = new VideoFile("视频A");
        text = new TextFile("文本A");
        folder.add(image);
        folder.add(video);
        folder.add(text);
        folder.display();
    }
}
