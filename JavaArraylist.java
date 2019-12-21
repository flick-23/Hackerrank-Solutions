import java.io.*;
import java.util.Scanner;
class JavaArraylist
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int i,j,x,y,q,d,a[][]=new int[n+1][n+1],b[][]=new int[n+1][n+1];
		for(i=1;i<=n;i++)
		{
			d=venki.nextInt();
			for(j=1;j<=d;j++)
			{
				a[i][j]=venki.nextInt();
				b[i][j]=1;
			}
		}
		q=venki.nextInt();
		for(i=1;i<=q;i++)
		{
			x=venki.nextInt();
			y=venki.nextInt();
			try
			{
				if(b[x][y]!=1)
				{
					System.out.println("ERROR!");
				}
				else
				{
					System.out.println(a[x][y]);
					
				}
			}
			catch (Exception e)
			{
				System.out.println("ERROR!");
			}
		}
	}
}