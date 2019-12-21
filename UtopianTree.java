import java.io.*;
import java.util.Scanner;
class UtopianTree
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		int i,x=0,a[]=new int[T];
		for(int t=0;t<T;t++)
		{
			x=0;
			int n=venki.nextInt();
			for(i=0;i<=n;i++)
			{
				if(i%2==0)
					x++;
				else
					x=2*x;
			}
			a[t]=x;
		}
		for(i=0;i<T;i++)
		System.out.println(a[i]);
	}
}