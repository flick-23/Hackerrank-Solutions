import java.io.*;
import java.util.Scanner;
class SmallesMultiple
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		int t,flag=0,c=0,i=1,j=0,N,a[]=new int[T];
		
		for(t=0;t<T;t++)
		{
			N=venki.nextInt();
			do
			{
				c=0;
				j++;
				for(i=1;i<=N;i++)
				{
					if(j%i==0)
						c++;
				}
			}while(c!=N);
			a[t]=j;
		}
		for(i=0;i<T;i++)
		System.out.println(a[i]);
	}
}