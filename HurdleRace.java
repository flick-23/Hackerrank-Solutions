import java.io.*;
import java.util.Scanner;
import java.lang.*;
class HurdleRace
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int k=venki.nextInt();
		int a[]=new int[n];
		int i,j,d;
		for(i=0;i<n;i++)
			a[i]=venki.nextInt();
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		if(a[n-1]>k)
			d=a[n-1]-k;
		else
			d=0;
		System.out.println(d);
	}
}
