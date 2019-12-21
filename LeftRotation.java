import java.io.*;
import java.lang.*;
import java.util.*;
class LeftRotation
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int d=venki.nextInt();
		long a[]=new long[n],A[]=new long[n];
		int i,c=0;
		for(i=0;i<n;i++)
			a[i]=venki.nextLong();
		int k=0;
		while(c!=n)
		{
			A[k]=a[d];
			System.out.print(a[d]+" ");
			c++;
			d++;
			k++;
			if(d>n-1)
			{
				d=0;
			}
		}
	}
}