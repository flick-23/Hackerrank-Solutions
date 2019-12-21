import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Day2 
{
	
    public static void main(String[] args)throws IOException 
	{
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
        int I=Integer.parseInt(venki.readLine());
        double D=Double.parseDouble(venki.readLine());
        String S=venki.readLine();
        I+=i; D+=d; 
        System.out.println(I+"\n"+D+"\n"+s+" "+S);
    }
}