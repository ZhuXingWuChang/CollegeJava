package zjuwengkai.castlegame;

//处理者类,专门用于处理各种命令,使得Game类不再需要通过硬编码来处理"命令"
public class Handler {
    protected Game game;

    public Handler(Game game) {
        this.game = game;
    }

    public void doCmd(String word) {
    }

    public boolean isBye() {
        return false;
    }
}
