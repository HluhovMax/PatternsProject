package patterns.creational.factory.factories;

import patterns.creational.factory.entities.BMW;
import patterns.creational.factory.entities.Car;

/**
 * Created by Max Hluhov on 04.11.2018.
 */
public class GermanCarFactory implements CarFactory {
    @Override
    public Car makeCar() {
        return new BMW();
    }
}
