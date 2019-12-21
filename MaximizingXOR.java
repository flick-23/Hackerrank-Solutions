import java.io.*;
import java.util.Scanner;
import java.lang.*;
class MaximizingXOR
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int l=venki.nextInt();
		int r=venki.nextInt();
		int i,j,x,a=0;
		for(i=l;i<=r;i++)
		{
			for(j=i;j<=r;j++)
			{
				x=i^j;
				if(x>a)
				{
					a=x;
				}
			}
		}
		System.out.println(a);
	}
}