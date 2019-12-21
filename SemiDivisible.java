import java.io.*;
import java.util.Scanner;
import java.math.*;
import java.math.BigInteger;
import java.math.BigDecimal;
class SemiDivisible
{
	public static void main(String[]args)throws IOException
	{
		Scanner venki=new Scanner(System.in);
		SemiDivisible  ob=new SemiDivisible();
		
		long L,R,i,j,lps=0,ups=0,temp;
		long sum=0;
		
		L=venki.nextLong();
		R=venki.nextLong();
		
		
				for(i=L;i<=R;i++)
				{
					double x=Math.sqrt(i);
					temp=(long)(Math.floor(x));
					lps=ob.Lprime(temp);
					if(x>temp)
						ups=ob.Uprime(temp+1);
					else
						ups=ob.Uprime(temp);
					if((i%lps==0)&&(i%ups!=0) || (((i%lps!=0)&&(i%ups==0))))
					{
						sum+=i;
					}
				}
			
			System.out.println(sum);
		
		
	}
	long Uprime(double n)
	{
		double i,sum=0,a=0,flag=0;
		do
		{
			sum=0;
			for(i=1;i<=n;i++)
			{
				if(n%i==0)
					sum++;
			}
			if(sum==2)
			{
				a=n;
				flag=1;
			}
			else
				n++;
		}while(flag!=1);
		return (long)a;
	}
	long Lprime(double n)
	{
		double i,sum=0,a=0,flag=0;
		do
		{
			sum=0;
			for(i=n;i>=1;i--)
			{
				if(n%i==0)
					sum++;
			}
			if(sum==2)
			{
				a=n;
				flag=1;
			}
			else
				n--;
		}while(flag!=1);
		return (long)a;
	}
}