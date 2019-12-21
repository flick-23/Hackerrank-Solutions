import java.util.Scanner;
import java.io.*;
import java.lang.*;
class CutTheSticks
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int a[]=new int[n],i,j,c=0;
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
		int C[]=new int[n]; int flag,x=0;
		for(i=0;i<n;i++)
		{
			flag=0;
			c=0;
			int min=a[i];
			for(j=i;j<n;j++)
			{
				
				if(a[j]>0)
				{
					int t=a[j]-min;
					a[j]=t;
					c++;
					flag=1;
				}
			}
			C[i]=c;
		}
		System.out.println(C[0]);
		for(i=1;i<n;i++)
		{
			if(C[i-1]!=C[i] && C[i]!=0)
				System.out.println(C[i]);
		}
	}
}