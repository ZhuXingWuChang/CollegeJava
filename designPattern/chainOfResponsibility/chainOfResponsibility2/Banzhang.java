package designPattern.chainOfResponsibility.chainOfResponsibility2;

public class Banzhang extends Officer{
    public Banzhang(String name) {
        super(name);
    }

    @Override
    public void disposeMission(Mission mission) {
        if(mission.getEnemyNum()<10){
            System.out.println("班长下达作战命令!");
        }
        else
        {
            if (this.successor != null) {
                this.successor.disposeMission(mission);
            }
        }
    }
}
