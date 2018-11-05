package patterns.creational.builder;

import patterns.creational.builder.entity.Car;

/**
 * Created by Max Hluhov on 05.11.2018.
 */
public class CarRental {
    CarBuider buider;

    public void setBuider(CarBuider buider) {
        this.buider = buider;
    }

    Car toRentACar() {
        buider.buildCar();
        buider.buildBrand();
        buider.buildBodyType();
        buider.buildPrice();

        Car car = buider.getCar();
        return car;
    }
}
