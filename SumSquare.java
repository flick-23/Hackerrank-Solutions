import java.io.*;
import java.util.Scanner;
import java.math.*;
class SumSquare
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		int  i,j,t,sum=0,sum_sq=0;
		int a[]=new int[1000];
		for(t=0;t<T;t++)
		{
			sum=0;sum_sq=0;
			long n=venki.nextInt();
			sum=(int)(n*(n+1))/2;
			sum_sq=(int)(n*(2*n+1)*(n+1))/6;
			j=(sum*sum)-sum_sq;
			a[t]=j;
		}
		for(i=0;i<T;i++)
			System.out.println(a[i]); 
	}
}