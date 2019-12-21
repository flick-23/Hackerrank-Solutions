import java.io.*;
import java.util.Scanner;
import java.lang.*;
class  StandardDeviation
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int x[]=new int[n];
		float a=0,b=0,c=0,mean=0;
		int i,sum=0;
		
		for(i=0;i<n;i++)
			x[i]=venki.nextInt();
		
		for(i=0;i<n;i++)
			sum+=x[i];
		
		mean=(float)sum/n;
		
		for(i=0;i<n;i++)
		{
			float A=(float)Math.abs(x[i]-mean);
			a+=A*A;
		}
		b=(float)a/n;
		c=(float)Math.sqrt(b);
		c=Math.round(c*10);
		System.out.println(c/10);
	}
}