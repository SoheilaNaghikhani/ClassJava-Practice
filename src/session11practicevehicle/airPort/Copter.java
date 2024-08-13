package src.session11practicevehicle.airPort;

import src.session11practicevehicle.FlyInterface;
import src.session11practicevehicle.TypeFuel;
import src.session11practicevehicle.Vehicle;

public class Copter extends Vehicle implements FlyInterface {
    public Copter(String brandName, TypeFuel typeFuel) {
        super(brandName, typeFuel);
    }

    @Override
    public void Fly() {
        System.out.println("FlyCopter");
    }

    public void verticalFly() {
        System.out.println("VerticalFly");
    }

}
