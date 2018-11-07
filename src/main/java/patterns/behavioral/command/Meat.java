package patterns.behavioral.command;

/**
 * Created by Max Hluhov on 07.11.2018.
 */
public class Meat implements Waiter {
    private Guest guest;

    public Meat(Guest guest) {
        this.guest = guest;
    }

    @Override
    public void execute() {
        guest.steak();
    }
}
