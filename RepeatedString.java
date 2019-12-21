import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.math.*;
import java.math.BigInteger;
class RepeatedString
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		String s=venki.readLine();
		String S=""+s;
		long n=Long.parseLong(venki.readLine());
		long x=0;
		int i,j=0,l=s.length(),L=0;
		if(l>n)
		{
			for(i=l;i<n;i++)
			{
				S+=""+s.charAt(j);
				j++;
				if(j==l)
					j=0;
			}
			L=S.length();
			for(i=0;i<L;i++)
			{
				if(S.charAt(i)=='a')
					x=(long)x+1;
			}
		}
		else if(l<n)
		{
			for(i=0;i<n;i++)
			{
				if(s.charAt(i)=='a')
				x=(long)x+1;
			}
		}
		System.out.println(x);
	}
}
