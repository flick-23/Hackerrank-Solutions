import java.io.*;
import java.util.Scanner;
import java.lang.*;
class FindDigits
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(venki.readLine());
		int n,i,x=0,c=0,temp=0,a[]=new int[100000],b[]=new int[T];
		
		for(int t=0;t<T;t++)
		{
			c=0;
			x=0;
			n=Integer.parseInt(venki.readLine());
			temp=n;
			while(temp!=0)
			{
				a[c]=temp%10;
				temp=temp/10;
				c++;
			}
			for(i=0;i<c;i++)
			{
				if(a[i]!=0 && n%a[i]==0)
					x++;
			}
			b[t]=x;
		}
		for(i=0;i<T;i++)
			System.out.println(b[i]);
	}	
}