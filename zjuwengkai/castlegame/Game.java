package zjuwengkai.castlegame;

import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private Room currentRoom;
    //String是key,而Handler是value
    private HashMap<String, Handler> handlers = new HashMap<String, Handler>();

    public Game() {
        handlers.put("go", new HandlerGo(this));
        handlers.put("bye", new HandlerBye(this));
        handlers.put("help", new HandlerHelp(this));
        createRooms();//create:创造
    }

    private void createRooms() {
        //城堡外，大堂，小酒吧，书房，卧室
        Room outside, lobby, pub, study, bedroom;

        //制造房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");

        //初始化房间的出口
        outside.setExit("east", lobby);
        outside.setExit("south", study);
        outside.setExit("west", pub);
        lobby.setExit("west", outside);
        pub.setExit("east", outside);
        study.setExit("north", outside);
        study.setExit("east", bedroom);
        bedroom.setExit("west", study);
        lobby.setExit("up", pub);
        pub.setExit("down", lobby);

        currentRoom = outside;  //从城堡门外开始
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入‘help’。");
        System.out.println();
        showPrompt();
    }

    //以下为用户命令

    public void goRoom(String direction) {
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("那里没有门！");
        } else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }

    public void showPrompt() {//prompt:提示
        System.out.println("你在" + currentRoom);
        System.out.print("出口有：");
        System.out.print(currentRoom.getExitDesc());
        System.out.println();
    }

    public void play() {
        Scanner in = new Scanner(System.in);
        while (true) {
            //获得一行字符串
            String line = in.nextLine();
            //如果遇到regex(这里是空格),那么将字符串分割为多个字符串
            String[] words = line.split(" ");
            Handler handler = handlers.get(words[0]);
            //words[1]不一定存在,为了防止下标越界,用value
            String value = "";
            if (words.length > 1) {
                value = words[1];
            }
            if (handler != null) {
                handler.doCmd(value);//如果words的长度只有1,那么value(null)传过去
                if (handler.isBye()) {
                    break;
                }
            }
//            if (words[0].equals("help")) {
//                printHelp();
//            } else if (words[0].equals("go")) {
//                goRoom(words[1]);
//            } else if (words[0].equals("bye")) {
//                break;
//            }
        }
        in.close();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.printWelcome();
        game.play();

        System.out.println("感谢您的光临。再见！");
    }
}
