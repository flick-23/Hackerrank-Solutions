import java.io.*;
import java.util.Scanner;
class LonelyInteger
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int a[]=new int[n],c=0,i,j;
		for(i=0;i<n;i++)
		{
			a[i]=venki.nextInt();
		}
		for(i=0;i<=100;i++)
		{
			c=0;
			for(j=0;j<n;j++)
			{
				if(a[j]==i)
				{
					c++;
				}
			}
			if(c==1)
			{
				System.out.println(i);
			}
		}
	}
}