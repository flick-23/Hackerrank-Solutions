import java .io.*;
import java.util.*;
import java.lang.*;
class MarcsCakewalk
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int i,j,temp=0,a[]=new int[n];
		long sum=0;
		for(i=0;i<n;i++)
		{
			a[i]=venki.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			sum+=(long)(Math.pow(2,i)*a[i]);
		}
		System.out.println(sum);
	}
}