import java.util.Scanner;
import java.io.*;
import java.math.BigInteger;
import java.math.*;
import java.lang.*;
class Natural
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		long N,T;int sum;
		int s[]=new int[100000];
		T=Long.parseLong(venki.readLine());
		for(int i=0;i<T;i++)
		{
			sum=0;
			N=Long.parseLong(venki.readLine());
			for(int j=1;j<N;j++)
			{
				if(j%3==0 || j%5==0)
					sum=sum+j;
			}
			s[i]=sum;
		}
		for(int i=0;i<T;i++)
			System.out.println(s[i]);
	}
}