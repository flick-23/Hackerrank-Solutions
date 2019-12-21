import java.io.*;
import java.util.Scanner;
class EqualizeTheArray
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int arr[]=new int[n],f[]=new int[n];
		int i,x=0,sum=0;
		
		for(i=0;i<n;i++)
			arr[i]=venki.nextInt();
		for(i=0;i<n;i++)
		{
			x=0;
			for(int j=0;j<n;j++)
			{
				if(arr[j]==arr[i])
					x++;
			}
			if(x>sum)
				sum=x;
		}
		sum=n-sum;
		System.out.println(sum);
	}
}