import java.io.*;
import java.util.Scanner;
class BirthCan
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		long ar[]=new long[100000];
		int i,j;
		long temp=0,c=0;
		
		for(i=0;i<n;i++)
			ar[i]=venki.nextLong();
		for(i=0;i<(n-1);i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			if(ar[i]==ar[n-1])
				c++;
		}
		System.out.println(c);
	}
}