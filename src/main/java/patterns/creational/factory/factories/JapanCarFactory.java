package patterns.creational.factory.factories;

import patterns.creational.factory.entities.Car;
import patterns.creational.factory.entities.Toyota;

/**
 * Created by Max Hluhov on 04.11.2018.
 */
public class JapanCarFactory implements CarFactory{
    @Override
    public Car makeCar() {
        return new Toyota();
    }
}
