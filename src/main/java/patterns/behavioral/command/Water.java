package patterns.behavioral.command;

/**
 * Created by Max Hluhov on 07.11.2018.
 */
public class Water implements Waiter {
    private Guest guest;

    public Water(Guest guest) {
        this.guest = guest;
    }

    @Override
    public void execute() {
        guest.justWater();
    }
}
