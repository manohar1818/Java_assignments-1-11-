package java_assignments11.java_assignment7.part1;

import java.util.ArrayList;

/*
 Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc.
 In the base class, provide methods that are common to all Rodents, and override these
  in the derived classes to perform different behaviors depending on the specific type of Rodent.
   Create an array of Rodent, fill it with different specific types of Rodents, and call your
    base-class methods to see what happens. Make the methods of Rodent abstract whenever possible
 */

public class Test {
    public static void main(String[] args) {
        // Array to store all the rodents
        ArrayList<Rodent> rodents = new ArrayList<>();
        // Parent refering to child object
        Rodent mouse = new Mouse();
        Rodent hamster = new Hamster();
        Rodent gerbil = new Gerbil();
        // adding each rodent to array
        rodents.add(mouse);
        rodents.add(hamster);
        rodents.add(gerbil);
        // running method1 by each rodent
        for(Rodent rodent: rodents) {
            rodent.method1();
        }
    }
}