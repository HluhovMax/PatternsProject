package patterns.creational.abstractfactory.entities;

import patterns.creational.abstractfactory.Body;
import patterns.creational.abstractfactory.CarDetailsFactory;
import patterns.creational.abstractfactory.Engine;
import patterns.creational.abstractfactory.Wheels;

/**
 * Created by Max Hluhov on 04.11.2018.
 */
public class CrossoverCarFactory implements CarDetailsFactory {
    @Override
    public Body getBody() {
        return new Sedan();
    }

    @Override
    public Engine getEngine() {
        return new Petrol();
    }

    @Override
    public Wheels getWheels() {
        return new OffroadWheels();
    }
}
