import java .io.*;
import java.util.*;
import java.lang.*;
class Pangrams
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		String s=venki.readLine();
		int ch,i,j=97,k=0,n=0,flag=0,a[]=new int[30];
		for(i=65;i<=90;i++)
		{
			for(k=0;k<s.length();k++)
			{
				ch=(int)s.charAt(k);
				if(ch==i||ch==j)
				{
					a[n]++;
				}
			}
			n++;
			j++;
		}
		for(i=0;i<26;i++)
		{
			if(a[i]<=0)
			{
				System.out.println("not pangram");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("pangram");
		}
	}
}