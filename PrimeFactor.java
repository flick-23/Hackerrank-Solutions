import java.io.*;
import java.lang.*;
import java.util.Scanner;
class PrimeFactor
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		int N,i,t,j,pos=0,c=0,a[]=new int[100000];
		for(i=0;i<T;i++)
		{
			N=venki.nextInt();
			for(j=1;j<=N;j++)
			{
				if(N%j==0)
				{
					c=0;
					for(t=1;t<=j;t++)
					{
						if(j%t==0)
							c++;
						
					}
					if(c==2)
						pos=j;
				}
			}
			a[i]=pos;
		}
		for(i=0;i<T;i++)
			System.out.println(a[i]);
	}
}