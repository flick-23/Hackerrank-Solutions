import java.io.*;
import java.util.Scanner;
import java.lang.*;
class GameofThrones1
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		String str=venki.readLine();
		int i,j,flag=0,c=0,l=str.length(),x=0;
		
		if(l%2==0)
		{
			for(i=0;i<l;i++)
			{
				c=0;char chr=str.charAt(i);j=0;
				while(j<l)
				{
					char ch=str.charAt(j);
					if(chr==ch)	
					{
						c++;
					}
					j++;
				}
				if(c<2)
				{
					flag=1;
				}
			}
		}
		else
		{
			for(i=0;i<l;i++)
			{
				c=0; char chr=str.charAt(i);
				j=0;
				while(j<l)
				{
					char ch=str.charAt(j);
					if(chr==ch)	
					{
						c++;
					}
					j++;
				}
				if(c<2)
				{
					x++;
				}
				if(x>1)
				{
					flag=1;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("NO");
		}
		if(flag==0)
		{
			System.out.println("YES");
		}
	}
}