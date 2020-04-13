package java_assignments11.java_assignment6;


import java.util.*;
/*
A vampire number v is a number with an even number of digits n,
 that can be factored into two numbers x and y each with n/2 digits and
 not both with trailing zeroes, where v contains precisely all the digits from x and from y, in any order.
 Write a java program to print first 100 vampire numbers.
 */
public class Vampire {
    // this is used to print first 100 Vampire Numbers
    public static void main(String[] args) {
        String[] str1, str2;
        int product, counter =0;
        for (int i = 10; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                if(counter==100)
                    break;
                product = i * j;
                int lengthi = String.valueOf(i).length();
                int lengthj = String.valueOf(j).length();
                // skip numbers less than 1000 and greater than 999999
                // also skips those numbers if both lengths are not the same
                if (product < 1000 || product > 999999 || lengthi != lengthj)
                    continue;

                // let product = 1395
                // this converts 1395 to string
                str1 = String.valueOf(product).split("");
                // this converts 15 + 93 to string 1593
                str2 = (String.valueOf(i) + String.valueOf(j)).split("");
                // 1395 to 1395 after sort
                Arrays.sort(str1);
                // 1593 to 1395 after sort
                Arrays.sort(str2);
                // if both are equal then print 1395 == 1395
                if (Arrays.equals(str1, str2)) {
                    counter++;
                    System.out.println(counter +"  : "+ i + "*" + j + "=" + product);
                }
            }
        }
    }
}