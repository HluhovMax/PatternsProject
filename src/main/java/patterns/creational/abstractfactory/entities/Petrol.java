package patterns.creational.abstractfactory.entities;

import patterns.creational.abstractfactory.Engine;

/**
 * Created by Max Hluhov on 04.11.2018.
 */
public class Petrol implements Engine {
    @Override
    public void engineType() {
        System.out.println("petrol engine type");
    }
}
