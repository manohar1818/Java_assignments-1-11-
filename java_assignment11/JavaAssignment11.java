package java_assignments11.java_assignment11;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;


/*
Using TextFile and a Map<Character,Integer>,
create a program that takes the file name as a command line argument and
 counts the occurrence of all the different characters. Save the results in a text file.
 */

class JavaAssignment11{
    // Creates an output file that contains th count of occurences of different characters in the input file
    public static void charOccurence(String inputText) throws Exception {
        // HashMap with char as a key and occurrences as a value
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        // for each char in the given inputText
        for (int i=0;i<inputText.length();i++) {
            Character ch = inputText.charAt(i);
            if (charMap.containsKey(ch)) {
                // If char is present in charCountMap,incrementing it's count by 1
                charMap.put(ch, charMap.get(ch) + 1);
            }
            else{
                charMap.put(ch, 1);
            }
        }
        // creates output file
        FileWriter fw=new FileWriter("src/java_assignments11/java_assignment11/outputfile2.txt");
        fw.write("Output\n");

        // appends the result to output file
        for (Map.Entry entry : charMap.entrySet()) {
            fw.append(entry.getKey() + " " + entry.getValue());
            fw.append("\n");
        }
        fw.close();
    }


    public static void main(String[] args) throws Exception {
        // To read content from the given input file and store it to string
        String inputText = new String(Files.readAllBytes(Paths.get("src/java_assignments11/java_assignment11/TextFile2.txt")));
        charOccurence(inputText);
    }
}
