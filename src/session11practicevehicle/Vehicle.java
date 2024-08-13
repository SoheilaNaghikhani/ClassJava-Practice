package src.session11practicevehicle;

public class Vehicle {
    private String brandName;
    private TypeFuel typeFuel;

    public void move() {
        System.out.println("moved");
    }

    public void start() {
        System.out.println("started");
    }

    public Vehicle(String brandName, TypeFuel typeFuel) {
        this.brandName = brandName;
        this.typeFuel = typeFuel;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public TypeFuel getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(TypeFuel typeFuel) {
        this.typeFuel = typeFuel;
    }
}
