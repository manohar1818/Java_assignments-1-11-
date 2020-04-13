package java_assignments11.java_assignment9;


import java.util.Scanner;
import java.util.regex.Pattern;


/*
String and Type Information

Using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression
that checks a sentence to see that it begins with a capital letter and ends with a period.

 */

public class JavaAssignment9 {
    // This is used to check whether sentence begins with a capital letter and ends with period.
    public static boolean test(String text) {
        // returns true if input matches with pattern
        return (Pattern.matches("^[A-Z]+.*\\.$", text));
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Enter Sentence");
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        boolean value = test(sentence);
        System.out.println("Sentence starts with Capital and ends with period .    :"+ value);
    }
}
