package java_assignments11.java_assignment5.manohar.assignment.singleton;

public class SingletonClass {
    // non static String member variable.
    String str;
    public SingletonClass(String s){
        this.str = s;
    }

    public static SingletonClass method1(String s){
        // initialising non static member inside static method is not possible
        // this.str =s;
        SingletonClass singleton = new SingletonClass(s);
        return singleton;
    }

    public void printString(){
        System.out.println(str);
    }


}
