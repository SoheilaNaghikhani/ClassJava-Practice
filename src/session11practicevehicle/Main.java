package src.session11practicevehicle;

import src.session11practicevehicle.airPort.AirPlain;
import src.session11practicevehicle.airPort.AirPort;
import src.session11practicevehicle.airPort.Copter;
import src.session11practicevehicle.airPort.Parking;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Peugeot", TypeFuel.benzine, CarBody.suv);
        Car car2 = new Car("Honda", TypeFuel.benzine, CarBody.suv);
        Car car3 = new Car("Fidelity", TypeFuel.benzine, CarBody.coupe);
        Car[] car = {car1, car2, car3};
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }

        Copter copter1 = new Copter("E323", TypeFuel.diesel);
        Copter copter2 = new Copter("J545", TypeFuel.diesel);

        AirPlain airPlain1 = new AirPlain("Airbus", TypeFuel.diesel, "W541C");
        AirPlain airPlain2 = new AirPlain("Boeing", TypeFuel.diesel, "W541C");
        AirPlain airPlain3 = new AirPlain("Fokker", TypeFuel.whiteSpirit, "W541C");
        Parking parking = new Parking(new Car[]{car1,car2,car3});
        parking.addParkCar(new Car("Dignity", TypeFuel.benzine, CarBody.sedan));
        System.out.println("Cars In Parking after Add Car :"+parking);
        AirPort airPort = new AirPort("MehrAbad", new AirPlain[]{airPlain1, airPlain2, airPlain3}, new Copter[]{copter2, copter2}, parking);
    }
}
