import java.io.*;
import java.lang.*;
import java.util.*;
class  ModifiedKaprekarNumbers
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		long p=venki.nextLong();
		long q=venki.nextLong();
		long flag=0;int i,j;
		for(long n=p;n<=q;n++)
		{
			long temp=n;int d=0;
			while(temp!=0)
			{
				temp=(long)temp/10;
				d++;
			}
			long N=(long)n*n;
			String str_N=String.valueOf(N);
			int L=str_N.length();
			String Ri="",Le="";
			for(i=L-d;i<L;i++)
			{
				char ch=str_N.charAt(i);
				Ri+=ch;
			}
			for(j=0;j<L-d;j++)
			{
				Le+=str_N.charAt(j);
			}
			long r=Integer.parseInt(Ri);
			long l=0;
			try
			{
				l=Integer.parseInt(Le);
			}
			catch (Exception e)
			{
				l=0;
			}
			long sum=(long)r+l;
			if(sum==n) 
			{
				if(n!=10 && n!=100 && n!=1000 && n!=10000 && n!=100000)
				{
					System.out.print(n+" ");
				}
				flag=1;
			}
		}
		if(flag!=1)
		{
			System.out.println("INVALID RANGE");
		}
	}	
}