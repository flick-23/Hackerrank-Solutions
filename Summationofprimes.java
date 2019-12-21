import java.io.*;
import java.util.Scanner;
class Summationofprimes
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		int i,j,c=0,flag=0,sum=0;
		for(int t=0;t<T;t++)
		{
			sum=0;
			int n=venki.nextInt();
			for(i=2;i<=n;i++)
			{
				c=0;
				for(j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						c++;
					}
					if(c>2)
						break;
				}
				if(c==2)
				{
					sum+=i;
				}
			}
			System.out.println(sum);
		}
	}
}