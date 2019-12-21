import java.io.*;
import java.lang.*;
import java.util.*;
class  SparseArrays
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int s=Integer.parseInt(venki.readLine());
		String S[]=new String[s];
		int i,j,c=0;
		for(i=0;i<s;i++)
		{
			S[i]=venki.readLine();
		}
		int q=Integer.parseInt(venki.readLine());
		String Q[]=new String[q];
		for(i=0;i<q;i++)
		{
			Q[i]=venki.readLine();
		}
		for(i=0;i<q;i++)
		{
			c=0;
			for(j=0;j<s;j++)
			{
				if(Q[i].equals(S[j]))
				{
					c++;
				}
			}
			System.out.println(c);
		}
	}	
}