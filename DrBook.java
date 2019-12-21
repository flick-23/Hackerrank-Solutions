import java.io.*;
import java.util.Scanner;
class DrBook
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int p=venki.nextInt();
		int i,c=1,b=0,f=0;
		
		if(n!=p){
		for(i=1;i<=n;i++)
		{
			if(i%2!=0)
				c--;
			if(i==p)
				f=c;
			c++;
		}
		c=1;
		for(i=n;i>=1;i--)
		{
			if(i%2==0)
				c--;
			if(i==p)
				b=c;
			c++;
		}
		if(b>f)
			System.out.println(f);
		else
			System.out.println(b);
		}
		else
			System.out.println("0");
	}
}