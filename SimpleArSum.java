import java.io.*;
import java.util.Scanner;
import java.math.BigInteger;
class SimpleArSum
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		long[] ar=new long[n];
		long sum=0L;
		for(int i=0;i<n;i++)
		{
			long a=venki.nextLong();
			ar[i]=(long)a;
			sum+=ar[i];
		}
		System.out.println(sum);
	}
}