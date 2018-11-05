package patterns.creational.prototype;

import java.util.Calendar;

/**
 * Created by Max Hluhov on 05.11.2018.
 */
public class GameSaverRunner {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        Game game = new Game(1, "first saving", date);

        System.out.println(game);

        GameSaver saver = new GameSaver(game);
        Game gameClone = saver.cloneGame();
        System.out.println(gameClone);
    }
}
