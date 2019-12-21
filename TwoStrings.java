import java.io.*;
import java.lang.*;
import java.util.Scanner;
class TwoStrings
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(venki.readLine());
		int i,j,c=0,flag=0;
		for(int t=0;t<n;t++)
		{
			c=0;flag=0;
			String s1=venki.readLine();
			String s2=venki.readLine();
			int S1[]=new int[500],S2[]=new int[500];
			for(i=0;i<30;i++)
			{
				S1[i]=0;
				S2[i]=0;
			}
			for(i=97;i<=122;i++)
			{
				for(j=0;j<s1.length();j++)
				{
					int ch=(int)s1.charAt(j);
					if(ch==i)
					{
						S1[c]++;
					}
				}
				c++;
			}
			c=0;
			for(i=97;i<=122;i++)
			{
				for(j=0;j<s2.length();j++)
				{
					int ch=(int)s2.charAt(j);
					if(ch==i)
					{
						S2[c]++;
					}
				}
				c++;
			}
			for(i=0;i<c;i++)
			{
				if(S1[i]>0 && S2[i]>0)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}