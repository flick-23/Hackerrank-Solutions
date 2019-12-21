import java.io.*;
import java.util.Scanner;
import java.lang.*;
class NonDivisibleSubset
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int k=venki.nextInt();
		int c=0;
		long a[]=new long[n];
		for(int i=0;i<n;i++)
			a[i]=venki.nextLong();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				long sum=a[i]+a[j];
				if(sum%k==0)
					c++;
			}
		}
		System.out.println(c);
	
	}
}
