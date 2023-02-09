/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IST242;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Year;
import java.util.*;

/**
 *
 * @author smv159
 */
public class Car {
    
    private String model;
    private int year;
    private CarType type;
    private ArrayList<String> trims;
    private int mpg;
    private static final Scanner input = new Scanner(System.in);
    
    public enum CarType {
        TRUCK, COUPE, VAN, WAGON, SEDAN, SUV, HATCHBACK, OTHER;
        
        public CarType toType(String type) {
            if (type.equalsIgnoreCase("truck")) return TRUCK;
            else if (type.equalsIgnoreCase("coupe")) return COUPE;
            else if (type.equalsIgnoreCase("van")) return VAN;
            else if (type.equalsIgnoreCase("wagon")) return WAGON;
            else if (type.equalsIgnoreCase("sedan")) return SEDAN;
            else if (type.equalsIgnoreCase("suv")) return SUV;
            else if (type.equalsIgnoreCase("hatchback")) return HATCHBACK;
            else return OTHER;
        }
    }
    
    public Car(String model, int year, CarType type, ArrayList<String> trims,
            int mpg) {
        this.model = model;
        this.year = year;
        this.type = type;
        this.trims = trims;
        this.mpg = mpg;
    }
    
    private static String inputModel() {
        System.out.print("Enter the car model: ");
        return input.nextLine();
    }
    
    private static int inputYear() {
        int year = 1950;
        do {
            System.out.print("Enter the car year: ");
            year = input.nextInt();
            //Consume the \n
            input.nextLine();
        } while (year <= 1950);
        return year;
    }
    
    private static CarType inputType() {
        System.out.print("Enter the car type (Truck, Coupe, Van, Wagon, Sedan, SUV, or Hatchback): ");
        return CarType.valueOf(input.nextLine());
//        return CarType.
    }
    
    private static List<String> inputTrims() {
        System.out.print("Enter the car trim level(s) by entering a , separated listing: ");
        return Arrays.asList(input.nextLine().trim().split(","));
    }
    
    private static int inputMpg() {
        int mpg = 0;
        do {
            System.out.print("Enter the car mpg: ");
            mpg = input.nextInt();
            //Consume the \n
            input.nextLine();
        } while (mpg <= 0);
        return mpg;
    }
    
    public static String combine() {
        String model = inputModel();
        int year =  inputYear();
        CarType type = inputType();
        List<String> trims = inputTrims();
        int mpg = inputMpg();
        
        StringBuilder details = new StringBuilder();
        details.append(model).append("\n");
        details.append(year).append("\n");
        details.append(type.toString()).append("\n");
        details.append(trims.toString()).append("\n");
        details.append(mpg).append("\n");
        
        return details.toString();
    }
    
    public static void write(String info) {
        try {
            FileWriter write = new FileWriter("car.txt");
            write.write(info);
            write.close();
            System.out.println("Info saved to car.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file" + e.getMessage());
        }//figure out what IOExeption is exactly then continue
    }

    public static void read() {
        String data = "";
        try {
            File text = new File("car.txt");
            Scanner reader = new Scanner(text);
            while (reader.hasNextLine()) {
                data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error Occurred");
            e.getMessage();
        }
    }

    public static void main(String[] args) {
//        String info = combine();
//        write(info);
//        read();

        ArrayList<Year> yrs = new ArrayList<>();
        yrs.add(Year.now());
        yrs.add(Year.of(2000));

        Year minYr = Collections.min(yrs.stream().toList());
        System.out.println(minYr.toString());
    }
}
