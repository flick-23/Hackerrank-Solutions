import java.io.*;
import java.lang.*;
import java.util.Scanner;
class SockMerchant
{
        public static void main(String[]args)
        {
                Scanner venki=new Scanner(System.in);
                int i,j,temp,c,f=0;
                int n, ar[]=new int[100];
                n=venki.nextInt();
                for(i=0;i<n;i++)
                {
                        ar[i]=venki.nextInt();
                }
                for(i=0;i<n;i++)
                {
                        for(j=i+1;j<n;j++)
                        {
                                if(ar[i]>ar[j])
                                {
                                        temp=ar[i];
                                        ar[i]=ar[j];
                                        ar[j]=temp;
                                }
                        }
                }
                i=0;c=0;
                while(i<=n)
                {
                        int tot=0;
                        for(j=c;j<n;j++)
                        {
                                if(ar[i]!=ar[j])
                                        break;
                                else 
                                        c++;
                                        tot++;
                        }
                        f+=tot/2;
                        i++;
                }
                System.out.println(f);

        }
}
