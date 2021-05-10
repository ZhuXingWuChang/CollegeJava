package designPattern.chainOfResponsibilityPattern.chainOfResponsibilityPattern2;

public class Yingzhang extends Officer{
    public Yingzhang(String name) {
        super(name);
    }

    @Override
    public void disposeMission(Mission mission) {
        if(mission.getEnemyNum()<200){
            System.out.println("营长下达作战命令!");
        }
        else
        {
            System.out.println("敌人太多了,需要开会讨论!");
        }
    }
}
