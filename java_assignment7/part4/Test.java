package java_assignments11.java_assignment7.part4;


/*
Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle.
Create factories for each type of Cycle, and code that uses these factories.
 */

public class Test{
    public static void main(String[] args) throws Exception {
        Factory factory = new Factory();
        factory.makeCycle("Unicycle").wheels();
        factory.makeCycle("Bicycle").wheels();
        factory.makeCycle("Tricycle").wheels();
    }
}