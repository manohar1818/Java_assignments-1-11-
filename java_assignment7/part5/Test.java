package java_assignments11.java_assignment7.part5;

/*
 Create a class with an inner class that has a non-default constructor (one that takes arguments).
  Create a second class with an inner class that inherits from the first inner class
 */


public class Test {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B(10);

    }
}

class A{
    class B{
        B(int num){
            System.out.println("The number is : "+num);
        }
    }
}

class D{
    public class E extends A.B{
        E(int num) {
            new A().super(num);
        }
    }
}



