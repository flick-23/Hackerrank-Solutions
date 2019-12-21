import java.io.*;
import java.util.Scanner;
class EleShop
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		long b=venki.nextLong();
		int n=venki.nextInt();
		int m=venki.nextInt();
		int k[]=new int[n], u[]=new int[m];
		int i,j,c,l=0;
		
		for(i=0;i<n;i++)
			k[i]=venki.nextInt();
		for(i=0;i<m;i++)
			u[i]=venki.nextInt();
		
		for(i=0;i<n;i++)
		{
			c=0;
			for(j=0;j<m;j++)
			{
				c=k[i]+u[j];
				if((c>l)&&(c<=b))
					l=c;
				else if(l==0)
					l=-1;
			}
		}
		System.out.println(l);
	}
}