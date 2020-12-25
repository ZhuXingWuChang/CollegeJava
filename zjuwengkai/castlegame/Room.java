package zjuwengkai.castlegame;

import java.util.HashMap;

public class Room {
    private String description;//description:描述
    private HashMap<String, Room> exits = new HashMap<String, Room>();

    public Room(String description) {
        this.description = description;
    }

    //设置房间的出口
    public void setExit(String dir, Room room) {
        exits.put(dir, room);
    }

    @Override
    public String toString() {
        return description;
    }

    public String getExitDesc() {//获得关于能够退出的房间的描述
        StringBuffer sb = new StringBuffer();
        //keySet()方法会返回所有的key组成的set集合视图
        //而foreach循环在该视图中访问每一个key
        for (String dir : exits.keySet()) {
            //然后我在循环内部,把这些key弄成一个用空格隔开的字符串
            sb.append(dir);
            sb.append(' ');
        }
        return sb.toString();
    }

    public Room getExit(String direction) {
        return exits.get(direction);
    }
}
