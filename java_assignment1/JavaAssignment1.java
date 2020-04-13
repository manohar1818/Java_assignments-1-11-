package java_assignments11.java_assignment1;

import java.io.File;
import java.util.regex.*;
import java.util.Scanner;

/*
Create a java program to search through the home directory and look for files that match a regular expression.
The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found.
 */

public class JavaAssignment1 {
    // This method is used to print the absolute path of the files that matches with given regular expression
    public static void fileLocator(String path , String regExp) {
        // converts given string to file
        File directory = new File(path);
        // for each file in the folder
        for(File f1:directory.listFiles()) {
            // if selected file is a directory then use recursive function to search inside it
            if(f1.isDirectory()) {
                fileLocator(f1.getAbsolutePath(), regExp);
            }
            // if selected file is not a directory then cross check with regExp and print
            else {
                if (Pattern.matches(regExp, f1.getName())) {
                    System.out.println(f1.getAbsolutePath());
                }
            }
        }
    }


    public static void main(String[] args) {
        String s="Y";
        String input = "";
        // takes input until continue is not entered
        while (s.equals("Y")) {
            System.out.println("Enter regular expression");
            Scanner in = new Scanner(System.in);;
            input = in.nextLine();
            fileLocator("/home/manohar",input);
            System.out.println("Enter Y to continue else N");
            Scanner num = new Scanner(System.in);
            s = num.nextLine();
        }
    }
}