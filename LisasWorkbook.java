import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LisasWorkbook 
{
    public static void main(String[] args) 
	{
			Scanner venki=new Scanner(System.in);
			int n=venki.nextInt();
			int k=venki.nextInt();
			int i,prob=1,b=0,s=0,p=0,sum=0,pages=0;
			int arr[]=new int[n];
			for(i=0;i<n;i++)
			{
				arr[i]=venki.nextInt();
				sum+=arr[i];
			}
			i=1;p=1;
			while(b<n)
			{
				//System.out.println("I :"+i);
				if(i==k)
				{
					pages++;
					//System.out.println("\nPages :"+pages);
					i=0;
				}
				if(p==arr[b])
				{
					b++;
					pages++;
					//System.out.println("\nPages :"+pages);
					p=0;
					i=0;
				}
				p++;
				i++;
			}
			pages--;
			//System.out.println("\nPages :"+pages);
			b=0;prob=1;p=0;
			try
			{
            for(i=1;i<=pages;i++)
            {
					System.out.println("\nS :"+s);
                    p=0;
                    if(prob==arr[b])
                    {
							//System.out.println("Prob :"+prob+", Arr[b] :"+arr[b]);
                            if(prob==i)
                            {
                                    s++;
                            }
                            prob=1;
                            b++;
                            continue;
                    }
                    while(p<k)
                    {
						//System.out.println("P :"+p+", Prob :"+prob);
                        if(prob==i)
                        {
                            s++;
							//System.out.println("Prob : "+prob+", I :"+i+", S :"+s);	
                        }                                                 
                        if(prob==arr[b])
                        {
							//System.out.println("Prob :"+prob+", Arr[b] :"+arr[b]);
                                prob=1;
                                b++;
                                break;
                        }
                        prob++;
                        p++;
                    }
            }
			}
			catch (Exception e)
			{
				int a;
			}
			System.out.println(s);
    }
}
