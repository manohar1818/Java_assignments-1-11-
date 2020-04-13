package java_assignments11.java_assignment7.part3;

/*
Create three interfaces, each with two methods. Inherit a new interface that combines
the three, adding a new method. Create a class by implementing the new interface and
also inheriting from a concrete class. Now write four methods, each of which takes one
of the four interfaces as an argument. In main( ), create an object of your class and pass it to each of the methods.
 */


public class ImplementingClass extends ConcreteClass implements NewInterface  {

    @Override
    public void newInterfaceMethod() {
        System.out.println("newInterfaceMethod");
    }

    @Override
    public void firstInterface1() {
        System.out.println("firstInterface1");
    }

    @Override
    public void firstInterface2() {
        System.out.println("firstInterface2");
    }

    @Override
    public void secondInterface1() {
        System.out.println("secondInterface1");
    }

    @Override
    public void secondInterface2() {
        System.out.println("secondInterface2");
    }

    @Override
    public void thirdInterface1() {
        System.out.println("thirdInterface1");
    }

    @Override
    public void thirdInterface2() {
        System.out.println("thirdInterface2");
    }

    public void method1(FirstInterface firstInterface ){
        firstInterface.firstInterface1();
        firstInterface.firstInterface2();

    }

    public void method2(SecondInterface secondInterface ){
        secondInterface.secondInterface1();
        secondInterface.secondInterface2();

    }

    public void method3(ThirdInterface thirdInterface ){
        thirdInterface.thirdInterface1();
        thirdInterface.thirdInterface2();

    }

    public void method4(NewInterface newInterface ){
        newInterface.newInterfaceMethod();

    }

    public static void main(String[] args) {
        ImplementingClass implementingClass = new ImplementingClass();
        implementingClass.method1(implementingClass);
        implementingClass.method2(implementingClass);
        implementingClass.method3(implementingClass);
        implementingClass.method4(implementingClass);
    }
}
