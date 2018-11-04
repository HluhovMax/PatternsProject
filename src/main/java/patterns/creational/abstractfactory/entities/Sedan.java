package patterns.creational.abstractfactory.entities;

import patterns.creational.abstractfactory.Body;

/**
 * Created by Max Hluhov on 04.11.2018.
 */
public class Sedan implements Body {
    @Override
    public void bodyType() {
        System.out.println("sedan body type");
    }
}
