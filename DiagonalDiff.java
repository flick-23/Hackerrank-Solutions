import java.io.*;
import java.util.Scanner;
import java.math.*;
class DiagonalDiff
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int a[][]=new int[n][n];
		int i,j,d1=0,d2=0;
		
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				a[i][j]=venki.nextInt();

		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
					d1+=a[i][j];
				if((i+j)==(n-1))
					d2+=a[i][j];
			}
		}
		int diff=Math.abs(d1-d2);
		System.out.println(diff);
	}
}