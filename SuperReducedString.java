import java.io.*;
import java.util.Scanner;
class SuperReducedString
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		String s=venki.readLine();
		int i,l=s.length(),c=0;
		String S="";
		for(i=97;i<=122;i++)
		{
			c=0;
			for(int j=0;j<l;j++)
			{
				int ch=(int)s.charAt(j);
				if(ch==i)
				{
					c++;
				}
			}
			if(c>0)
			{
				char ch=(char)i;
				System.out.println("CH :"+ch+", C :"+c);
				if(c%2 != 0)
				{
					S+=""+ch;
				}
				else
				{
					S+="";
				}
			}
		}
		if(S.equals(""))
		{
			System.out.println("Empty String");
		}
		else
		{
			System.out.println(S);
		}
	}
}