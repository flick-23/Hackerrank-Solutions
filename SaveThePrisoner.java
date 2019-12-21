import java.io.*;
import java.util.Scanner;
class SaveThePrisoner
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		long a[]=new long[T];int t;
		for(t=0;t<T;t++)
		{
			long n=venki.nextLong();
			long m=venki.nextLong();
			long s=venki.nextLong();
			long k=s;
			for(long i=0;i<m;i++)
			{
				//System.out.println("\nI :"+i+" K :"+k);
				if(k==n && i!=m-1)
				{
					//System.out.println("\nI :"+i+" K :"+k);
					k=1;
					continue;
				}
				else 
				{
					k++;
				}
			}
			System.out.println(k-1);
		}
	}
}