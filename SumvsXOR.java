import java.io.*;
import java.util.Scanner;
import java.lang.*;
import java.math.BigInteger;
class SumvsXOR
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		long n=venki.nextLong();
		int i=0;
		long x,X=0,a=0;
		if(n==0)
			System.out.println("1");
		else{
		while(i<n)
		{
			x=(long)n^i;
			X=(long)n+i;	
			if(x==X)
			{
				a++;
			}
			i++;
		}
		System.out.println(a);}
	}
}