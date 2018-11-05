package patterns.creational.builder;

import patterns.creational.builder.entity.BodyType;
import patterns.creational.builder.entity.Brand;
import patterns.creational.builder.entity.Price;

/**
 * Created by Max Hluhov on 05.11.2018.
 */
public class FamilyCarBuilder extends CarBuider{
    @Override
    void buildBrand() {
        car.setBrand(Brand.TOYOTA);
    }

    @Override
    void buildBodyType() {
        car.setBodyType(BodyType.HATCHBACK);
    }

    @Override
    void buildPrice() {
        car.setPrice(Price.LOWCOST);
    }
}
