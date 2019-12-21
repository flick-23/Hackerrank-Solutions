import java.io.*;
import java.util.Scanner;
class MinMaxSum
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		long a[]=new long[5];
		int i,j;
		long min=0,max=0,temp=0;;
		
		for(i=0;i<5;i++)
			a[i]=venki.nextLong();
		
		for(i=0;i<4;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(i=0;i<4;i++)
			min+=a[i];
		for(i=4;i>=1;i--)
			max+=a[i];
		
		System.out.println(min+" "+max);
	}
}