package patterns.behavioral.command;

/**
 * Created by Max Hluhov on 07.11.2018.
 */
public class Guest {

    private String dish;

    private String order() {
        return "today i will order: ";
    }

    public void steak() {
        dish = "steak";
        System.out.println(order() + dish);
    }

    public void salad() {
        dish = "salad";
        System.out.println(order() + dish);
    }

    public void soup() {
        dish = "soup";
        System.out.println(order() + dish);
    }

    public void justWater() {
        dish = "just water";
        System.out.println(order() + dish);
    }
}
