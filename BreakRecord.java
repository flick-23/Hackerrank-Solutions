import java.io.*;
import java.util.Scanner;
class BreakRecord
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int N=venki.nextInt();
		long a[]=new long[N];
		a[0]=venki.nextLong();
		long min=a[0],max=a[0];
		int x=0,X=0;
		for(int i=1;i<N;i++)
		{
			a[i]=venki.nextLong();
			if(a[i]<min)
			{
				min=a[i];
				x++;
			}
			if(a[i]>max)
			{	max=a[i];X++;}
		}
		System.out.println(X+" "+x);
	}
}
