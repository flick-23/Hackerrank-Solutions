import java.util.*;
import java.text.*;

public class CurrencyFormat
{
    
    public static void main(String[] args) 
        {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        double c; int i;
                NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
                NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINESE);
                NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRENCH);
                NumberFormat in = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
    
        String CH=""+ch.format(payment);
                String IN=""+in.format(payment);
                String FR=""+fr.format(payment);
                String US=""+us.format(payment);
                
                String CH_1="";
        for(i=2;i<CH.length();i++)
                        CH_1+=""+CH.charAt(i);

                
                
                String IN_1="";
        for(i=1;i<IN.length();i++)
                        IN_1+=""+IN.charAt(i);
                
                String FR_1="";
        for(i=0;i<FR.length()-1;i++)
                        FR_1+=""+FR.charAt(i);

                
                System.out.println("US: " + US);
        System.out.println("India: " + "Rs."+IN_1);
        System.out.println("China: "+"￥" + CH_1);
        System.out.println("France: " + FR_1+"€");
    }
}

