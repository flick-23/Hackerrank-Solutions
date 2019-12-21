import java.io.*;
import java.util.*;
import java.lang.*;
class JimandtheOrders
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		long order[]=new long[n], prep[]=new long[n],a[]=new long[n],T[]=new long[n];
		int i,j; long temp=0;
		for(i=0;i<n;i++)
		{
			order[i]=venki.nextInt();
			prep[i]=venki.nextInt();
			T[i]=prep[i]+order[i];
			a[i]=prep[i]+order[i];
		}
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int c=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i]==T[j])
				{
					System.out.print((j+1)+" ");
					c++;
				}
				if(c==n)
				{
					break;
				}	
			}
		
				if(c==n)
				{
					break;
				}
		}
	}
}