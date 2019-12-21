import java.io.*;
import java.util.Scanner;
class MarsExploration
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		String s=venki.readLine();
		String S="";
		int c=0,l=s.length();
		if(l==1)
		{
			S="S";
		}
		else if(l==2)
		{
			S="SO";
		}
		else
		{
			int L=l-2;
			S="SO";
			for(int i=1;i<=L;i++)
			{
				if(i%3==0)
				{
					S+="O";
				}
				else
				{
					S+="S";
				}
			}
		}
		System.out.println(S);
		for(int i=0;i<l;i++)
		{
			if(s.charAt(i) != S.charAt(i))
			{
				c++;
			}
		}
		System.out.println(c);
	}
}