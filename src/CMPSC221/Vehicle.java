package CMPSC221;

import java.awt.Color;
import java.util.ArrayList;

public class Vehicle {
    ArrayList<Wheel> wheels;
    Color color;
    String brand;
    String model;
    int numOfDoors;

    public Vehicle(Color color, String brand, String model, int numOfDoors) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.numOfDoors = numOfDoors;
        wheels = new ArrayList<>();
    }

    public void addWheel(Wheel wheel) {
        wheels.add(wheel);
    }

    public Wheel removeWheel(int index) {
        return wheels.remove(index);
    }

    public ArrayList<Wheel> getWheels() { return wheels; }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    @Override
    public String toString() {
        return "Vehicle:\n" +
                "# Of Wheels=" + wheels.size() + "\n" +
                "Color = " + color.toString() + "\n" +
                "Brand = '" + brand + '\'' + "\n" +
                "Model = '" + model + '\'' + "\n" +
                "# Of Doors = " + numOfDoors;
    }
}
