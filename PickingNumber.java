import java.io.*;
import java.util.Scanner;
class PickingNumber
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int a[]=new int[n],i,j,c=0,l=0;
		for(i=0;i<n;i++)
			a[i]=venki.nextInt();
		
		for(i=0;i<n;i++)
		{
			c=0;
			for(j=0;j<n;j++)
			{
				if(a[i]-a[j]==1 || a[i]-a[j]==0)
				{
					c++;
					if(c>l)
					{
						l=c;
					}
				}
			}
			
		}
		System.out.println(l);
	}
}