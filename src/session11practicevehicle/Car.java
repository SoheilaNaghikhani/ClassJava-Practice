package src.session11practicevehicle;

public class Car extends Vehicle {
    private CarBody carBody;

    public Car(String brandName, TypeFuel typeFuel, CarBody carBody) {
        super(brandName, typeFuel);
        this.carBody = carBody;
    }

    @Override
    public String toString() {
        return
                "{ BrandName=" + getBrandName()+ ", carBody=" + carBody + ", TypeFuel=" + getTypeFuel() +
                        '}';
    }
}
