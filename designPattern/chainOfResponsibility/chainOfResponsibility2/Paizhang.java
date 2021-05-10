package designPattern.chainOfResponsibility.chainOfResponsibility2;

public class Paizhang extends Officer{
    public Paizhang(String name) {
        super(name);
    }

    @Override
    public void disposeMission(Mission mission) {
        if(mission.getEnemyNum()<50){
            System.out.println("排长下达作战命令!");
        }
        else
        {
            if (this.successor != null) {
                this.successor.disposeMission(mission);
            }
        }
    }
}
