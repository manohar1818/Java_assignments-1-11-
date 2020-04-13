package java_assignments11.java_assignment8;

/*
Create three new types of exceptions. Write a class with a method that throws all three.
In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
 Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.
 */


class Exception1 extends Exception {
    Exception1(String s) {
        super(s);
    }
}


class Exception2 extends Exception {
    Exception2(String s) {
        super(s);
    }
}


class Exception3 extends Exception {
    Exception3(String s) {
        super(s);
    }
}




// This class is used to handle the user defined exceptions
public class ExceptionHandling {
    Exception exception;

    ExceptionHandling(Exception exception) {
        this.exception = exception;
    }


    public void testException() throws Exception {
        try {
            throw exception;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally executed");
        }
    }

    public static void main(String[] args) throws Exception {
        // creating objects for each exception
        ExceptionHandling exceptionHandling1 = new ExceptionHandling(new Exception1("Exception1"));
        ExceptionHandling exceptionHandling2 = new ExceptionHandling(new Exception2("Exception2"));
        ExceptionHandling exceptionHandling3 = new ExceptionHandling(new Exception3("Exception3"));
        ExceptionHandling exceptionHandling4 = new ExceptionHandling(new NullPointerException("Null pointer Exception"));
        exceptionHandling1.testException();
        exceptionHandling2.testException();
        exceptionHandling3.testException();
        exceptionHandling4.testException();
    }
}