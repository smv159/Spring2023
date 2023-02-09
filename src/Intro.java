import CMPSC221.PythonToJava;
import IST242.Breed;
import IST242.Dog;

import java.util.Scanner;

public class Intro {

//    public static void main(String[] args) {
//        System.out.println("Hello World");
//
//    }
    public static void main(String[] args){

        int number = 2;
        if (number % 77 != 0) {
            System.out.println("odd");
        }

        PythonToJava ptj = new PythonToJava();
        ptj.names.add("Seth");

        ptj.onlyS();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = keyboard.nextInt();



        //Clears the input buffer
        keyboard.nextLine();

        String str = keyboard.nextLine();
        //\nHello world\n
        System.out.println(str);

        PythonToJava.test();


        Dog strongBad = new Dog("StrongBad", new Breed("St. Bernard", "Sweden"), "2011");
        strongBad.setName("Strong Bad");
        strongBad.getName();
        System.out.println("Dogs name is " + strongBad.getName());
        //Dog.getName();
        strongBad.birth= "2000";
        strongBad.isDead();

    }


}


