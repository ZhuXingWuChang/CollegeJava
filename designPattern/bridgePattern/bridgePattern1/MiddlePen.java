package designPattern.bridgePattern.bridgePattern1;

public class MiddlePen extends Pen
{
    @Override
    public void draw(String name)
    {
        String penType = "中号毛笔绘制";
        this.color.bepaint(penType, name);
    }
}
