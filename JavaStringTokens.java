import java.io.*;
import java.util.Scanner;
class JavaStringTokens
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		String s=venki.readLine();
		s=s.trim();
		String S[]=s.split("[ !,?.\\_'@]+");
		int c=0;
		if(s.length()==0)
		{
			System.out.println("0");
		}
		else
		{
			for (String a : S)
			{			
				c++;
			}
			System.out.println(c);
			for (String a : S)
			{			
				System.out.println(a);
			}
		}
		
	}
}