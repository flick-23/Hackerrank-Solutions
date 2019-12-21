import java.io.*;
import java.util.Scanner;
class BinaryNumbers
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		long num=venki.nextLong();
		long n=num,r=0,rev=1,b=0,flag=0,rem=0;
		
		while(n!=1)
		{
			r=n%2;
			b=b*10+r;
			n=n/2;
		}
		while(flag != 1)
		{
			rem=b%10;
			rev=rev*10+rem;
			b=b/10;
			if(b==0)
			{
				flag=1;
			}	
		}
		num=rev;
		rev=0;int f=0,c=0;
		while(num!=0)
		{
			rem=num%10;
			if(rem==1)
			{
				f++;
			}
			if(rem==0)
			{
				f=0;
			}
			if(f>c)
			{
				c=f;
			}
			num=num/10;
		}
		System.out.println(c);
	}
}