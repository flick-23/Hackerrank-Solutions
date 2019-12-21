import java.io.*;
import java.util.Scanner;
import java.lang.*;
class CircularArrayRotation
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int k=venki.nextInt();
		int q=venki.nextInt();
		int t,i,j,a[]=new int[100000],b[]=new int[100000];
		
		for(i=0;i<n;i++){
			a[i]=venki.nextInt();}
			
		for(j=0;j<k;j++)
		{
			for(i=n;i>0;i--)
			{
				a[i]=a[i-1];
			}
			a[0]=a[n];
			
		}
		for(t=0;t<q;t++)
		{
			int m=venki.nextInt();
			b[t]=a[m];
		} 	
		for(i=0;i<q;i++)
			System.out.println(b[i]);
	}
}
