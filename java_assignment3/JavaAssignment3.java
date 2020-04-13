package java_assignments11.java_assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.Scanner;

/*
Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.
Use the system ping utility, do not use any deprecated methods.
 */

public class JavaAssignment3 {
    public static void executeCommand(String command) throws Exception {
        // starts the process
        Process p = Runtime.getRuntime().exec(command);
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String s = "";
        int count =0;
        double avg=0;
        // reading output stream of the command
        while ((s = inputStream.readLine()) != null) {
            String stringa,stringb;
            stringa = "time=";
            stringb =s;
            int index = stringb.indexOf(stringa);
            if(index == -1) {
                //System.out.println(s);
            }
            else
                {
                    index= index + stringa.length();
                    System.out.println(s);
                    String h= stringb.substring(index);
                    int i = h.indexOf("ms");
                    // this is used to get the time from the entire text
                    // 64 bytes from maa05s02-in-f4.1e100.net (172.217.163.68): icmp_seq=1 ttl=57 time=22.7 ms
                    // 22.7 ms
                    h=h.substring(0,i-1);
                    avg = avg +Double.parseDouble(h);
                    count = count +1;

            }
        }
        avg = avg/count;
        System.out.println("The average time is :"+avg+" ms");

    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the command");
        String command = in.nextLine();
        //Example         "ping -c 3 www.google.com";
        executeCommand(command);


    }
    }

