package patterns.creational.factory;

import patterns.creational.factory.entities.Car;
import patterns.creational.factory.factories.CarFactory;
import patterns.creational.factory.factories.GermanCarFactory;
import patterns.creational.factory.factories.JapanCarFactory;

/**
 * Created by Max Hluhov on 04.11.2018.
 */
public class CarShowroom {
    public static void main(String[] args) {
        CarFactory carFactory = createCarByName("bmw");
        Car car = carFactory.makeCar();
        car.advantage();
    }

    static CarFactory createCarByName(String carName) {
        if (carName.equalsIgnoreCase("bmw")) {
            return new GermanCarFactory();
        }else if (carName.equalsIgnoreCase("toyota")) {
            return new JapanCarFactory();
        } else {
            throw new RuntimeException(carName + " is unknown car name.");
        }
    }
}
