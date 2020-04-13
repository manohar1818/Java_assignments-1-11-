package java_assignments11.java_assignment2;

import java.util.Scanner;

/*
Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive).
Write time and space complexity of your solution as comments in the source file.
 */

// Time Complexity : O(n)       if there are n inputs
// Space Complexity : O(1)

public class JavaAssignment2 {
    // checks whether String contains all alphabets or not
    public static boolean check(String inputString){
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        inputString = inputString.toLowerCase();
        for(int i=0;i<26;i++){
            if(!inputString.contains(Character.toString(alphabets.charAt(i)))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="continue";
        // takes input until continue is not entered
        while (s.equals("continue")) {
            System.out.println("Enter String");
            Scanner in = new Scanner(System.in);
            String inputString = in.nextLine();
            boolean b = check(inputString);
            if (b == true)
                System.out.println("Given input string contains all the alphabets");
            else
                System.out.println("Given input string does not contains all the alphabets");

            System.out.println("continue or stop");
            Scanner num = new Scanner(System.in);
            s = num.nextLine();
        }
    }
}
