import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrongPassword
 {
    static int minimumNumber(int n, String password) 
    {
        int a=0,A=0,N=0,s=0;
        int c=0;
        if(n<6)
        {
            for(int i=0;i<n;i++)
            {
                int ch=(int)password.charAt(i);
                if(ch>=97 && ch<=122)
                {
                    a=1;
                }
                if(ch>=65 && ch<=90)
                {
                    A=1;
                }
                if(ch>=48 && ch<=57)
                {
                    N=1;
                }
                if(ch>=33 && ch<=45)
                {
                    s=1;
                }  

                if(n==1)
                {c=5;}
                if(n==2)
                {
                        c=4;
                }
                if(n==3)
                {
                        c=3;
                }
                if(n==4)
                {
                        if((a!=1 && A==1 && N!=1 && s!=1)||(a==1 && A!=1 && N!=1 && s!=1)||(a!=1 && A!=1 && N==1 && s!=1)||(a!=1 && A!=1 && N!=1 && s==1))
                        {
                                c=3;
                        }
                        
                        else
                        {
                                c=2;
                        }
                }
                if(n==5)
                {
                        if((a!=1 && A==1 && N!=1 && s!=1)||(a==1 && A!=1 && N!=1 && s!=1)||(a!=1 && A!=1 && N==1 && s!=1)||(a!=1 && A!=1 && N!=1 && s==1))
                        {
                                c=3;
                        }
                        else if((a==1 && A==1 && N!=1 && s!=1)||(a!=1 && A==1 && N==1 && s!=1)||(a!=1 && A!=1 && N==1 && s==1)||(a==1 && A!=1 && N!=1 && s==1)||(a==1 && A!=1 && N==1 && s!=1)||(a!=1 && A==1 && N!=1 && s==1))
                        {
                                c=2;
                        }
                        else
                        {
                                c=1;
                        }
                }
            }        

        }
        else
        {
            for(int i=0;i<n;i++)
            {
                int ch=(int)password.charAt(i);
                if(ch>=97 && ch<=122)
                {
                    a=1;
                }
                if(ch>=65 && ch<=90)
                {
                    A=1;
                }
                if(ch>=48 && ch<=57)
                {
                    N=1;
                }
                if(ch>=33 && ch<=45)
                {
                    s=1;
                }
                
                if(a!=1 && A!=1 && N!=1 && s!=1)
                {
                    c=4;
                }
                else if((a!=1 && A==1 && N!=1 && s!=1)||(a==1 && A!=1 && N!=1 && s!=1)||(a!=1 && A!=1 && N==1 && s!=1)||(a!=1 && A!=1 && N!=1 && s==1))
                {
                        c=3;
                }
                else if((a==1 && A==1 && N!=1 && s!=1)||(a!=1 && A==1 && N==1 && s!=1)||(a!=1 && A!=1 && N==1 && s==1)||(a==1 && A!=1 && N!=1 && s==1)||(a==1 && A!=1 && N==1 && s!=1)||(a!=1 && A==1 && N!=1 && s==1))
                {
                        c=2;
                }
                else if((a==1 && A==1 && N==1 && s!=1)||(a==1 && A==1 && N!=1 && s==1)||(a==1 && A!=1 && N==1 && s==1)||(a!=1 && A==1 && N==1 && s==1))
                {
                        c=1;
                 }
                else if(a!=1 && A!=1 && N!=1)
                {
                    c=3;
                }
                else if(a!=1 && A!=1)
                {
                    c=2;
                }
                else if(a!=1)
                {
                    c=1;
                }
                else
                {
                        c=0;
                }

            }
        }
        return c;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
