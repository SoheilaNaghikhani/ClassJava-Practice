package src.session11practicevehicle.airPort;

import src.session11practicevehicle.FlyInterface;
import src.session11practicevehicle.TypeFuel;
import src.session11practicevehicle.Vehicle;

public class AirPlain extends Vehicle implements FlyInterface {

    private String name;


    public AirPlain(String brandName, TypeFuel typeFuel, String name) {
        super(brandName, typeFuel);
        this.name = name;
    }

    @Override
    public void Fly() {
        System.out.println("FlyAirPlain");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
