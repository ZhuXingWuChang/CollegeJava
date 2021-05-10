package designPattern.chainOfResponsibility.chainOfResponsibility2;

public class Client {
    public static void main(String[] args) {
        Officer banzhang, paizhang, yingzhang;

        banzhang = new Banzhang("张三");
        paizhang = new Paizhang("李四");
        yingzhang = new Yingzhang("王五");

        banzhang.setSuccessor(paizhang);
        paizhang.setSuccessor(yingzhang);

        Mission m1 = new Mission("老大", 3);
        banzhang.disposeMission(m1);

        Mission m2 = new Mission("老二", 33);
        banzhang.disposeMission(m2);

        Mission m3 = new Mission("老三", 133);
        banzhang.disposeMission(m3);

        Mission m4 = new Mission("老四", 300);
        banzhang.disposeMission(m4);
    }
}
