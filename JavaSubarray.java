import java.io.*;
import java.util.Scanner;
class JavaSubarray
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		String s=venki.read();
		char ch,chr;
		for(i=0;i<s.length()-1;i++)
		{
			ch=s.charAt(i);
			chr=s.charAt(i+1);
			if((ch==32||ch==33||ch==39||ch==44||ch==46||ch==63||ch==64||ch==95)&&((chr>=65&&chr<=90)||(chr>=97&&chr<=122)))
			{
				c++;
			}
		}
		pos=0;
		for(i=0;i<s.length()-1;i++)
		{
			ch=s.charAt(i);
			chr=s.charAt(i+1);
			System.out.print(ch);
			if((ch==32||ch==33||ch==39||ch==44||ch==46||ch==63||ch==64||ch==95)&&((chr>=65&&chr<=90)||(chr>=97&&chr<=122)))
			{
				System.out.println();
			}
		}
	}
}