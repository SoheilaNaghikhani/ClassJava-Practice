package src.session11practicevehicle.airPort;

import src.session11practicevehicle.Car;

import java.util.Arrays;

public class Parking {
    private Car[] cars;
    int lenghtParking=100;


    public Parking(Car[] cars) {
        this.cars=new Car[lenghtParking];
        for (int i=0;i<cars.length;i++)
        {
            this.cars[i] = cars[i];
        }

    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public void addParkCar(Car car) {
        for (int i = 0; i < this.cars.length; i++) {
            if (this.cars[i]==null) {
                this.cars[i] = car;
                return;
            }
        }

    }

    @Override
    public String toString() {
        return  Arrays.toString(cars) ;
    }
}
