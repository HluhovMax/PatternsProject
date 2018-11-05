package patterns.creational.builder;

import patterns.creational.builder.entity.Car;

/**
 * Created by Max Hluhov on 05.11.2018.
 */
public class CarRentalShowroom {
    public static void main(String[] args) {
        CarRental rental = new CarRental();

        rental.setBuider(new ExtreamCarBuilder());

        Car car = rental.toRentACar();

        System.out.println(car);
    }
}
