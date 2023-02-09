package CMPSC221;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ParkingLot {
    ArrayList<LightPole> lps;
    ArrayList<Vehicle> vehicles;
    int numOfSpots;
    int numOfFloors;

    public ParkingLot(int spots, int floors) {
        lps = new ArrayList<>();
        vehicles = new ArrayList<>();
        numOfSpots = spots;
        numOfFloors = floors;
    }

    public int occupiedSpots() {
        return vehicles.size();
    }

    public int availableSpots() {
        return numOfSpots - occupiedSpots();
    }

    public boolean parkAVehicle(Vehicle vehicle) {
        boolean isParked = false;
        if (availableSpots() > 0) {
            isParked = true;
            vehicles.add(vehicle);
            System.out.println("Parked " + vehicle);

        } else {
            System.out.println("Lot Full");
        }
        return isParked;
    }


    public static void main(String[] args) {
        //Create the Parking Lot
        ParkingLot pl = new ParkingLot(100, 1);
        //Create the Light Poles
        LocalDateTime ldtStart = LocalDateTime.now();
        LocalDateTime ldtEnd = ldtStart.plusHours(6);
        pl.lps.add(new LightPole(10, "LED", ldtStart, ldtEnd));
        pl.lps.add(new LightPole(10, "LED", ldtStart, ldtEnd));
        pl.lps.add(new LightPole(10, "LED", ldtStart, ldtEnd));
        pl.lps.add(new LightPole(10, "LED", ldtStart, ldtEnd));

        //Add a few Vehicles
        pl.parkAVehicle(new Vehicle(Color.red, "Honda", "Civic", 4));
        pl.parkAVehicle(new Truck(Color.white, "Ford", "F150 Raptor", 4, 6.5, "4WD", 7000));
        System.out.println("Number of Available spots: " + pl.availableSpots());

        //Fill the lot
        while (pl.availableSpots() > 0) {
            pl.parkAVehicle(new Truck(Color.black, "Ford", "F150 XL", 4, 6.5, "4WD", 7000));
        }
        //Lot should be full
        boolean added = pl.parkAVehicle(new Vehicle(Color.red, "Honda", "Civic Si", 4));
    }
}
