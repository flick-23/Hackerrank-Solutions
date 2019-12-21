import java.io.*;
import java.util.Scanner;
class Prime10001st
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		int i,j,flag=0,x=0,c=0;
		
		for(int t=0;t<T;t++)
		{
			x=0;c=0;
			int n=venki.nextInt();
			for(i=2;i<100000;i++)
			{
				c=0;flag=0;
				for(j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						c++;
					}
					if(c>2)
					{
						flag=1;
						break;
					}
				}
				if(c==2)
				{
					x++;
				}
				if(x==n)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}
}