import java.io.*;
import java.util.Scanner;
class BirthdayChoc
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int s[]=new int[n];
		int i,j,x,M,c=0;
		for(i=0;i<n;i++)
			s[i]=venki.nextInt();
		int d=venki.nextInt();
		int m=venki.nextInt();
		for(i=0;i<n;i++)
		{
			x=0;M=0;
			for(j=i;j<n;j++)
			{
				x+=s[j];
				M++;
				if(x==d && m==M)
				{
					c++;
					M=1;
					x=s[i];
					break;
				}
				if(m==M)
				{
					x=s[i];
					M=1;
				}
			}
		}
		System.out.println(c);
	}
}
