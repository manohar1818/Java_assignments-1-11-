package java_assignments11.java_assignment5.manohar.assignment.main;

import java_assignments11.java_assignment5.manohar.assignment.data.DataClass;
import java_assignments11.java_assignment5.manohar.assignment.singleton.SingletonClass;

public class MainClass {
    public static void main(String[] args) {
        DataClass dataClass = new DataClass();
        dataClass.printData();

        /*
        printData2() cannot be accessed because local variables are called without initialization
        dataClass.printData2();

         */

        SingletonClass singletonClass = SingletonClass.method1("Hello World");
        singletonClass.printString();

    }

}
