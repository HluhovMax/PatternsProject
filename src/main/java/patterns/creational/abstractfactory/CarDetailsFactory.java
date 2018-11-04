package patterns.creational.abstractfactory;

/**
 * Created by Max Hluhov on 04.11.2018.
 */
public interface CarDetailsFactory {
    Body getBody();

    Engine getEngine();

    Wheels getWheels();
}
