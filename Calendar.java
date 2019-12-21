import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.Object;
import java.util.Calendar;
class Calendar 
{

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year)
     {
        Calendar mycal2 = Calendar.getInstance();  
              mycal2.set(year, (month-1) , day);  
              String s1=""+mycal2.getTime();
             String s=""+s1.charAt(0)+""+s1.charAt(1)+""+s1.charAt(2);
             String S="";
        if(s.equals("Mon"))
        {
                S="MONDAY";
        }
        if(s.equals("Tue"))
        {
                S="TUESDAY";
        }       
        if(s.equals("Wed"))
        {
                S="WEDNESDAY";
        }       
       if(s.equals("Thu"))
        {
                S="THURSDAY";
        }        
        if(s.equals("Fri"))
        {
                S="FRIDAY";
        }        
        if(s.equals("Sat"))
        {
                S="SATURDAY";
        }    
        if(s.equals("Sun"))
        {
                S="SUNDAY";
        }
      
        return S;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
