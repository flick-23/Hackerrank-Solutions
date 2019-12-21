import java.io.*;
import java.util.Scanner;
import java.lang.*;
class FunnyString
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int q=venki.nextInt();
		int i,j,t; String s,r=""; int d=0,D=0;
		int  S[]=new int[100000],R[]=new int[100000],c;
		String a[]=new String[100000]; 
		int l;
		for(t=0;t<q;t++)
		{
			r="";c=0;
			s=venki.next();
			l=s.length();
			for(i=l-1;i>=0;i--)
			{
				r+=s.charAt(i);
			}
			for(i=0;i<l;i++)
			{
				S[i]=(int)s.charAt(i);
				R[i]=(int)r.charAt(i);
			}

			for(i=1;i<=l;i++)
			{
				for(j=i-1;j<i;j++)
				{
					d=Math.abs(S[j]-S[i]);
					D=Math.abs(R[j]-R[i]);
				}
				if(d==D)
				{
					c++;
				}
			}
			if(c==l-1)
				a[t]="Funny";
			else
				a[t]="Not Funny";
		}
		for(t=0;t<q;t++)
				System.out.println(a[t]);
	}
}
