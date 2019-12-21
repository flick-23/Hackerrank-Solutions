import java.io.*;
import java.lang.*;
import java.util.Scanner;
class Fibbo
{
	int Fib(int n)
	{
		int f1=0,f2=1,f3=1,sum=0;
		while(f3<=n)
		{
			if(f3%2==0)
			{
				sum=sum+f3;
			}
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
		return sum;
	}
	public static void main(String[]args)
	{
		Fibbo ob=new Fibbo();
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		int N,i,sum[]=new int[T];
		for(i=0;i<T;i++)
		{
			N=venki.nextInt();
			sum[i]=ob.Fib(N);
		}
		for(i=0;i<T;i++)
			System.out.println("\n"+sum[i]);
	}
}