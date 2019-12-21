import java.io.*;
import java.util.Scanner;
class FlatlandSpaceStations
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int m=venki.nextInt();
		int a[]=new int[m],i,max=-1;
		for(i=0;i<m;i++)
		{
			a[i]=venki.nextInt();
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		//System.out.println("MAX :"+max);
		if(max<m)
		{
			System.out.println("0");
		}
		else
		{
			System.out.println(max-m);
		}
	}
}