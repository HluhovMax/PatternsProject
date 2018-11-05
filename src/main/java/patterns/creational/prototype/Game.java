package patterns.creational.prototype;

import java.util.Calendar;

/**
 * Created by Max Hluhov on 05.11.2018.
 */
public class Game implements Copyable {
    private int id;
    private String saveName;
    private Calendar date;

    public Game(int id, String saveName, Calendar date) {
        this.id = id;
        this.saveName = saveName;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSaveName() {
        return saveName;
    }

    public void setSaveName(String saveName) {
        this.saveName = saveName;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", saveName='" + saveName + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        Game copy = new Game(id, saveName, date);
        return copy;
    }
}
