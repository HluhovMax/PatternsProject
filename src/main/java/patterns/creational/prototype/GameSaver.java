package patterns.creational.prototype;

/**
 * Created by Max Hluhov on 05.11.2018.
 */
public class GameSaver {
    Game game;

    public GameSaver(Game game) {
        this.game = game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    Game cloneGame() {
        return (Game) game.copy();
    }
}
