package CMPSC221;

import java.awt.Color;

public class Truck extends Vehicle {

    double bedSize;
    String driveType;
    double towingCap;

    public Truck(Color color, String brand, String model, int numOfDoors,
                 double bdSize, String driveType, double towing) {
        super(color, brand, model, numOfDoors);
        bedSize = bdSize;
        this.driveType = driveType;
        towingCap = towing;
    }

    public String toString() {
        return super.toString() + "\n" +
                "Bed Size = " + bedSize + "\n" +
                "Drivetrain = '" + driveType + "'\n" +
                "Towing Capacity = " + towingCap + "lbs\n";
    }
}
