package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.entities.CrossoverCarFactory;

/**
 * Created by Max Hluhov on 04.11.2018.
 */
public class CarShowRoom {
    public static void main(String[] args) {
        CarDetailsFactory carDetailsFactory = new CrossoverCarFactory();
        Body body = carDetailsFactory.getBody();
        Engine engine = carDetailsFactory.getEngine();
        Wheels wheels = carDetailsFactory.getWheels();

        System.out.println("Making cars");

        body.bodyType();
        engine.engineType();
        wheels.wheelsType();
    }
}
