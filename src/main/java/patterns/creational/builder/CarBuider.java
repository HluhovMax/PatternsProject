package patterns.creational.builder;

import patterns.creational.builder.entity.Car;

/**
 * Created by Max Hluhov on 05.11.2018.
 */
public abstract class CarBuider {
    Car car;

    void buildCar() {
        car = new Car();
    }

    abstract void buildBrand();

    abstract void buildBodyType();

    abstract void buildPrice();

    Car getCar() {
        return car;
    }
}
