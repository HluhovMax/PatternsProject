package patterns.behavioral.command;

/**
 * Created by Max Hluhov on 07.11.2018.
 */
public class RestorantRunner {
    public static void main(String[] args) {

        Guest guest = new Guest();

        Chief chief = new Chief(
                new Meat(guest),
                new Salad(guest),
                new Soup(guest),
                new Water(guest)
        );

        chief.pourTheWater();
        chief.cookSoup();
        chief.cookSalad();
        chief.cookSteak();
    }
}
