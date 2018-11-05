package patterns.creational.singleton;

/**
 * Created by Max Hluhov on 05.11.2018.
 */
public class BookkeeperRunner {
    public static void main(String[] args) {
        BookkeepingClass.getINSTANCE().makeAccounting();
    }
}
