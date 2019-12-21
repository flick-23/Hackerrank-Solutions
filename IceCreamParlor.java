import java.io.*;
import java.util.Scanner;
class IceCreamParlor
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		for(int t=0;t<T;t++)
		{
			int m=venki.nextInt();
			int n=venki.nextInt();
			int a[]=new int[n+3],i,j,sum=0;
			for(i=1;i<=n;i++)
			{
				a[i]=venki.nextInt();
			}
			try
			{
				for(i=1;i<n;i++)
				{
					for(j=i+1;j<=n;j++)
					{
						sum=a[i]+a[j];
						if(sum==m)
						{
							System.out.println(i+" "+j);
							break;
						}
					}
				}
			}
			catch (Exception e)
			{
				int k=0;
			}
		}
	}
}