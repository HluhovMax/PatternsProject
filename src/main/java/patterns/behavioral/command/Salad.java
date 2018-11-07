package patterns.behavioral.command;

/**
 * Created by Max Hluhov on 07.11.2018.
 */
public class Salad implements Waiter {
    private Guest guest;

    public Salad(Guest guest) {
        this.guest = guest;
    }

    @Override
    public void execute() {
        guest.salad();
    }
}
