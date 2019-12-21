import java.io.*;
import java.util.*;
import java.lang.*;
class MissingNumbers
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		long n=venki.nextLong();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
		{
			a[i]=venki.nextLong();
		}
		long m=venki.nextLong();
		long b[]=new long[10000000];
		for(int i=0;i<m;i++)
		{
			b[i]=venki.nextLong();
		}
		int k=0;long x[]=new long[10000000];
		for(int i=0;i<m;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[j]==b[i])
				{
					break;
				}
				else
				{
					x[k]=(long)b[j];
					k++;
					break;
				}
			}
		}
		for(int i=0;i<k;i++)
		{
			System.out.print(x[i]+" ");
		}
	}
}