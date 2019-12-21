import java.io.*;
import java.util.Scanner;
class DivisibleSumPair
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int k=venki.nextInt();
		int a[]=new int[n];
		int i,j,sum=0,c=0;
		for(i=0;i<n;i++)
			a[i]=venki.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				sum=a[i]+a[j];
				if(((a[i]+a[j])%k)==0)
				{
					c++;
					System.out.println("SUM :"+a[i]+"+"+a[j]+" :"+sum);
				}
			}
		}
		System.out.println(c);
	}
}
