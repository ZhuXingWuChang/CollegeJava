package 设计模式.bridgePattern;

public class SmallPen extends Pen
{
    @Override
    public void draw(String name)
    {
        String penType = "小号毛笔绘制";
        this.color.bepaint(penType, name);
    }
}
