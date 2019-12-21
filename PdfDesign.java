import java.io.*;
import java.util.*;


public class PdfDesign {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int I=scan.nextInt();
        I+=i;
        double D=scan.nextDouble();
        D+=d;
        String a=scan.nextLine();
        
        a=s.concat(a);
        System.out.println(I+"\n"+D+"\n"+a);

        scan.close();
    }
}