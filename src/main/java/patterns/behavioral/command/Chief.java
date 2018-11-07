package patterns.behavioral.command;

/**
 * Created by Max Hluhov on 07.11.2018.
 */
public class Chief {
    private Waiter steakOrder;
    private Waiter saladOrder;
    private Waiter soupOrder;
    private Waiter waterOrder;

    public Chief(Waiter steakOrder,
                 Waiter saladOrder,
                 Waiter soupOrder,
                 Waiter waterOrder) {
        this.steakOrder = steakOrder;
        this.saladOrder = saladOrder;
        this.soupOrder = soupOrder;
        this.waterOrder = waterOrder;
    }

    public void cookSteak() {
        steakOrder.execute();
    }

    public void cookSalad() {
        saladOrder.execute();
    }

    public void cookSoup() {
        soupOrder.execute();
    }

    public void pourTheWater() {
        waterOrder.execute();
    }
}
