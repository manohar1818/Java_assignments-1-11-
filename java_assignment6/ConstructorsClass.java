package java_assignments11.java_assignment6;

/*
 Create a class with two (overloaded) constructors.
 Using this, call the second constructor inside the first one.
 */

public class ConstructorsClass
{
    // default constructor
    ConstructorsClass()
    {
        // This is used to calls parameterised constructor
        this(10);
        System.out.println("The Default constructor");
    }

    // parameterized constructor
    ConstructorsClass(int x)
    {
        System.out.println(x);
        System.out.println("Parameterised Constructor");
    }

    public static void main(String args[])
    {
        // invokes default constructor first
        ConstructorsClass  constructorsClass= new ConstructorsClass();
    }
}