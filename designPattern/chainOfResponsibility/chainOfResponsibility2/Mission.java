package designPattern.chainOfResponsibility.chainOfResponsibility2;

public class Mission {
    private String sendName;
    private int enemyNum;

    public Mission(String sendName, int enemyNum) {
        this.sendName = sendName;
        this.enemyNum = enemyNum;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public int getEnemyNum() {
        return enemyNum;
    }

    public void setEnemyNum(int enemyNum) {
        this.enemyNum = enemyNum;
    }
}
