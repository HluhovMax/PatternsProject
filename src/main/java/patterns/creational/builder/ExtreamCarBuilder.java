package patterns.creational.builder;

import patterns.creational.builder.entity.BodyType;
import patterns.creational.builder.entity.Brand;
import patterns.creational.builder.entity.Price;

/**
 * Created by Max Hluhov on 05.11.2018.
 */
public class ExtreamCarBuilder extends CarBuider{
    @Override
    void buildBrand() {
        car.setBrand(Brand.GMC);
    }

    @Override
    void buildBodyType() {
        car.setBodyType(BodyType.CROSSOVER);
    }

    @Override
    void buildPrice() {
        car.setPrice(Price.PREMIUM);
    }
}
