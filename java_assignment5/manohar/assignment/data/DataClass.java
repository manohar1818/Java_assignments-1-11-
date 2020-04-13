package java_assignments11.java_assignment5.manohar.assignment.data;

public class DataClass {
    // both members are not initialised
    int num;
    char ch;

    // method to print the above uninitialised variables
    public void printData(){
        System.out.println(num);
        System.out.println(ch);
    }


    /*
    // This method throws an error because the local variables are stored on a stack,
     but instance variables are stored on the heap,so local variables are not given initial default values

    public void printData2(){
        int localNUm;
        char localCh;
        System.out.println(localNUm);
        System.out.println(localCh);
    }

     */


}
