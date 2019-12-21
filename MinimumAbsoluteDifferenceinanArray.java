import java .io.*;
import java.util.*;
import java.lang.*;
class MinimumAbsoluteDifferenceinanArray
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int a[]=new int[n];
		int i,j,d=0;long min=1000000000l;
		for(i=0;i<n;i++)
		{
			a[i]=venki.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				d=Math.abs(a[i]-a[j]);
				if(d<min)
				{
					min=d;
				}
			}
		}
		System.out.println(min);
	}
}