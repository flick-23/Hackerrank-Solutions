import java.io.*;
import java.util.Scanner;
import java.lang.*;
class MigratroyBirds
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		long n=venki.nextLong();
		long a[]=new long[200000];
		long f=0,c=0;int j;
		for(j=0;j<n;j++)
			a[j]=venki.nextLong();
		for(long i=1;i<=5;i++)
		{
			c=0;
			for(j=0;j<n;j++)
			{
				if(a[j]==i)
				{
					c++;
				}
			}
			if(c>f)
			{
				f=i;
			}
		}
		System.out.println(f);
	}
}
