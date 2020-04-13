package java_assignments11.java_assignment7.part2;

import java.util.ArrayList;

/*
2. Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. Add a balance( ) method
to Unicycle and Bicycle, but not to Tricycle. Create instances of all three types and upcast them to an array of Cycle.
Try to call balance( ) on each element of the array and observe the results. Downcast and call balance( ) and observe what happens.
 */

public class Test{
    public static void main(String[] args) {
        ArrayList<Cycle> cycles = new ArrayList<>();
        //Up-casting − Converting a subclass type to a superclass type.
        System.out.println("Up-casting");
        Cycle unicycle = (Cycle) new Unicycle();
        Cycle bicycle = (Cycle) new Bicycle();
        Cycle tricycle = (Cycle) new Tricycle();

        // adding each instance to arrays
        cycles.add(unicycle);
        cycles.add(bicycle);
        cycles.add(tricycle);

        // calling each instance in the array
        for(Cycle cycle: cycles) {
            // We cannot call the method directly with cycle ,
            // We need to know its type , then call method by casting to it
            if(cycle instanceof Unicycle){
                ((Unicycle) cycle).balance();
            }
            else if(cycle instanceof Bicycle){
                ((Bicycle) cycle).balance();
            }
        }


        // Down-casting − Converting a superclass type to a subclass type
        System.out.println("Down-Casting");
        Cycle c1 = new Unicycle();
        Unicycle unicycle1 = (Unicycle) c1;
        unicycle1.balance();

        Cycle c2 = new Bicycle();
        Bicycle bicycle1 = (Bicycle) c2;
        bicycle1.balance();

        Cycle c3 = new Tricycle();
        Tricycle tricycle1 = (Tricycle) c3;
        // This has no balance() method

    }
}