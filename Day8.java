//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Day8{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String N[]=new String[100000];
        int P[]=new int[100000];
        for(int i = 0; i < n; i++)
        {
            String name = in.next();
            int phone = in.nextInt();
            N[i]=name;
            P[i]=phone; 
        }
        int i=0;
        while(in.hasNext())
        {
            String s = in.next();
            if(s.equals(N[i]))
            {
                    System.out.println(N[i]+"="+P[i]);
            }
            else
            {
                    System.out.println("Not found");
            }
            i++;
        }
        in.close();
    }
}

