package patterns.creational.factory.entities;

/**
 * Created by Max Hluhov on 04.11.2018.
 */
public class Toyota implements Car{
    @Override
    public void advantage() {
        System.out.println("affordable price");
    }
}
