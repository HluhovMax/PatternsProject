package patterns.creational.builder.entity;

/**
 * Created by Max Hluhov on 05.11.2018.
 */
public class Car {
    private Brand brand;
    private BodyType bodyType;
    private Price price;

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", bodyType=" + bodyType +
                ", price=" + price +
                '}';
    }
}
