package IST242.inclass;

import java.util.ArrayList;
import java.util.Random;

public class Tester {

    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();

        pets.add(new Dog("Roofus", 5));
        pets.add(new Goldfish("Gloopy", 1));
        pets.add(new Dog("Echo", 12, true));
        pets.add(new Dog("Chip", 5, false));
        pets.add(new Dog("Simba", 6, true));

        Random rand = new Random();
        for (Pet pt : pets) {
            int randNum = rand.nextInt(3);
            Pet.Command cmd = Pet.Command.values()[randNum];

            System.out.println(pt + " given command " +
                    cmd + " .. " + pt.doTrick(cmd));
        }
    }
}
