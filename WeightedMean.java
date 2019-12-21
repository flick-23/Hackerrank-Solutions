import java.io.*;
import java.util.Scanner;
import java.lang.*;
class WeightedMean
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int x[]=new int[n]; int w[]=new int[n];
		int i,num=0,den=0;
		
		for(i=0;i<n;i++)
		{
		x[i]=venki.nextInt();}
		for(i=0;i<n;i++){
			w[i]=venki.nextInt();
		}
		for(i=0;i<n;i++)
		{
			num+=x[i]*w[i];
			den+=w[i];
		}
		float m=(float)num/den;
		m=m*10;
		m=Math.round(m);
		System.out.println(m/10);
	}
}