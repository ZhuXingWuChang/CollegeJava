package designPattern.mementoPattern;

import designPattern.mementoPattern.dp.*;

public class Client2
{
    public static void main(String[] args)
    {
        UserInfoDTO user = new UserInfoDTO();
        Caretaker c = new Caretaker();  // 创建负责人
        AbstractCommand restoreCommand = new RestoreCommand(user); // 创建撤销命令
        Controller control = new Controller(restoreCommand); // 创建控制器
        
        user.setAccount("张三");
        user.setPassword("123456");
        user.setTelNo("0713 1234567");
        System.out.println("状态一");
        user.show();
        c.setMemento(user.saveMemento());   // 保存备忘录
        System.out.println("--------------------------");
    
        user.setPassword("111111");
        user.setTelNo("13100001111");
        System.out.println("状态二:");
        user.show();
        System.out.println("--------------------------");
    
        control.restore(c.getMemento());    // 从备忘录中恢复
        System.out.println("回到状态一:");
        user.show();
        System.out.println("--------------------------");
    }
}
