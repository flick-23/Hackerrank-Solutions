import java.io.*;
import java.lang.*;
import java.util.*;
class DesignerViewer
{
	public static void main(String[]args)throws IOException
	{
		Scanner venki=new Scanner(System.in);
		int a[]=new int[226];
		int i,l=0,max=0,k=97;
		for(i=0;i<26;i++)
		{
			a[k]=venki.nextInt();
			k++;
		}
		String s=venki.next();
		for(i=0;i<s.length();i++)
		{
			int ch=(int)s.charAt(i);
			l=a[ch];
			if(l>max)
			{
				max=l;
			}
		}
		System.out.println(max*(s.length()));
	}
}