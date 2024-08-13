package src.session11practicevehicle.airPort;

import src.session9practice.AirPlane;

public class AirPort {
    private String name;
    private AirPlain[] airPlains;
    private Copter[] copters;
    private Parking parking;

    public AirPort(String name, AirPlain[] airPlains, Copter[] copters, Parking parking) {
        this.name = name;
        this.airPlains = airPlains;
        this.copters = copters;
        this.parking = parking;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public AirPlain[] getAirPlanes() {
        return airPlains;
    }
    public void setAirPlanes(AirPlain[] airPlains) {
        this.airPlains = airPlains;
    }
    public Copter[] getCopters() {
        return copters;
    }
    public void setCopters(Copter[] copters) {
        this.copters = copters;
    }

    public Parking getParking() {
        return parking;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }
}
