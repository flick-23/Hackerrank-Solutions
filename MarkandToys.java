import java.io.*;
import java.lang.*;
import java.util.*;
class  MarkandToys
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		long k=venki.nextLong();
		long a[]=new long[n];
		int i,j;long c=0;
		for(i=0;i<n;i++)
		{
			a[i]=venki.nextLong();
		}
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					long temp=(long)a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		long sum=0;
		for(i=0;i<n;i++)
		{
			sum+=a[i];
			if(sum>=k)
			{
				break;
			}
			c++;
		}
		System.out.println(c);
	}	
}