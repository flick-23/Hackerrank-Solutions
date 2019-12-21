import java.io.*;
import java.math.*;
import java.lang.*;
import java.util.Scanner;
class MeanMedianMode
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int N=venki.nextInt();
		int x[]=new int[N];
		double median=0.0,mean=0.0;
		int mode=0,f=0,i;
		int j,m[]=new int[N];
		for(i=0;i<N;i++)
		{
			x[i]=venki.nextInt();
			mean+=x[i];
		}
		mean=mean/N;
		for(i=0;i<N;i++)
		{
			for(j=i+1;j<N;j++)
			{
				if(x[i]>x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		if(N%2==0)
		{
			int k=(int)N/2;
			median=(float)(x[k]+x[k-1])/2;
		}
		else
			median=x[N/2]/2;
		for(i=0;i<N;i++)
		{
			f=0;
			for(j=0;j<N;j++)
			{
				if(x[i]==x[j])
				{
					f++;
				}
			}
			if(f>mode)
			{
				if(f>1 && mode<x[i])
				{
					break;
				}
				else
					mode=x[i];
			}
		}
		mean=(double)mean*10;
		mean=(double)Math.round(mean)/10;
		median=(double)median*10;
		median=(double)Math.round(median)/10;
		System.out.println(mean+"\n"+median+"\n"+mode);
	}
}