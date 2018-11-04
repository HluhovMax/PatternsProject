package patterns.creational.abstractfactory.entities;

import patterns.creational.abstractfactory.Wheels;

/**
 * Created by Max Hluhov on 04.11.2018.
 */
public class OffroadWheels implements Wheels {
    @Override
    public void wheelsType() {
        System.out.println("wheels for off road");
    }
}
