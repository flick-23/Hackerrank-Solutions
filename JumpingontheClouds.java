import java.io.*;
import java.util.Scanner;
class JumpingontheClouds
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int i,flag=0,a[]=new int[n],c;
		for(i=0;i<n;i++)
		{
			a[i]=venki.nextInt();
		}
		i=0;c=0;
		while(flag!=1)
		{
			int x=i+2;
			int y=i+1;
			if(x<n)
			{
				if(a[i+2]==0)
				{
					i=i+2;
					c++;
				}
				else
				{
					i=i+1;
					c++;
				}
			}
			else
			{
				i=i+1;
				c++;
			}
			if(i==(n-1))
			{
				flag=1;
				break;
			}
		}
		System.out.println(c);
	}
}