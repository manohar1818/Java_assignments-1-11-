package java_assignments11.java_assignment4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

/*
  Gruber Healthcare has different types of forms for their customer, one of which is a know your customer
  form ( KYC ) which has to be filled annually. Each form has a date which signifies the date the form was
  filled called the form date.

  Due to government regulations the KYC form can only be filled within + or - 30 days of the signup anniversary
  of a customer. When filling it up, you have to provide the form date. If you are past the +-30 day anniversary
  then you can back-date it so that it falls in the +-30-day window. When filling it up you cannot use a future
  date for the form date.

  For Example, assuming today is 4 Apr 2017 and I had signed up on 1st Mar 2014, my window for KYC submission this
  year would be 30 Jan 2017 to 31 Mar 2017. Since it is already 4th Apr - I would have to back-date the KYC to
  a date in this range.

  Note: The KYC form can be filled only for the closest anniversary in the past or within 30 days range in future.
  Anniversary refers to same day and month every year. If your birthday is 01-02-1992 -then your first
  anniversary will be 01-02-1993, the 2nd will be 01-02-1994 and so on. 01-02-1992 is not an anniversary.

  Given the signup date and the current date, provide the allowable date range for the form date.

  Input - First line is an integer n as the number of inputs to be passed. Next, n lines are n input for the
  program in the format dd-mm-yyyy dd-mm-yyyy Each line has two dates separated by space where the first date
  in signup date and the second date is the current date.

  Output - Range of dates for KYC form in format dd-mm-yyyy dd-mm-yyyy

 */


public class JavaAssignment4
{
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    public static Calendar applyDate=Calendar.getInstance();
    public static Calendar renewalDate=Calendar.getInstance();
    public static void range(String signup, String current){

        StringTokenizer st = new StringTokenizer(signup,"-");
        int apply[]= new int[3];
        int i=0;
        while(st.hasMoreTokens())
            apply[i++] = Integer.parseInt(st.nextToken());

        applyDate.set(Calendar.DATE,apply[0]);
        applyDate.set(Calendar.MONTH,apply[1]-1);
        applyDate.set(Calendar.YEAR,apply[2]);


        st = new StringTokenizer(current,"-");
        int renewal[]= new int[3];
        i=0;
        while(st.hasMoreTokens())
            renewal[i++] = Integer.parseInt(st.nextToken());

        renewalDate.set(Calendar.DATE,renewal[0]);
        renewalDate.set(Calendar.MONTH,renewal[1]-1);
        renewalDate.set(Calendar.YEAR,renewal[2]);

        Date currDate=renewalDate.getTime();

        // if currentDate is before the sign up date, the given input will not have any range
        if(applyDate.getTime().after(currDate))
        {
            System.out.println("No ranges");

        }
        applyDate.set(Calendar.YEAR, renewal[2]);
        applyDate.add(Calendar.DATE,-30);

        System.out.print(df.format(applyDate.getTime())+" ");
        applyDate.add(Calendar.DATE,60);

        // if currentDate occurs before the endDate
        if(applyDate.getTime().after(currDate))
            System.out.println(df.format(currDate));
        // currentDate occurs after endDate
        else
            System.out.println(df.format(applyDate.getTime()));

        return;

    }

    public static void main(String args[])throws IOException
    {
        int count = Integer.parseInt(br.readLine());
        while(count>0)
        {
            String input[] = br.readLine().split(" ");
            range(input[0],input[1]);
            count--;
        }
    }
}