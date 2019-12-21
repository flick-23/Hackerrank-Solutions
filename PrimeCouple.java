import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
class PrimeCouple
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int t=venki.nextInt();
		for(int T=0;T<t;T++)						//Test cases
		{
			int flag=0;								
			long n=venki.nextLong();
			long N_back=0,N_front=0;	
			while(flag!=1)						//This while loop is to get prime number behind n
			{
				for(long i=n-1;i>=2;i--)		// this for loop sends the number 'i' to the nested for loop, which should be checked if its prime or not
				{
					int c=0;
					for(long j=1;j<=i;j++)		// checks if the number is prime
					{
						if(i%j==0)
						{
							c++;
						}
						if(c>2)			// if c>2 then number is divisible by more than 2 numbers, so break out of this far loop
						{	
							break;
						}
					}
					if(c==2)			// if c=2 then its only divisible by 2 numbers and its prime, so we found our prime number, TIME TO GET OUT OF WHILE LOOP
					{
						N_back=i;
						flag=1;
						break;
					}
				}

			}
			flag=0;		// reinitialising flag
			long i=n+1;	
			while(flag!=1)		// this for loop checks for prime number above n
			{
				int c=0;
				for(long j=1;j<=i;j++) 	// checks if number is prime
				{
					if(i%j==0)
					{
						c++;
					}
					if(c>2)
					{
						break;
					}
				}
				if(c==2)
				{
					flag=1;
					N_front=i;
					break;
				}
				i++;
			}
			long l1=N_front-n;	//check the distance of the prime number ahead of n
			long l2=n-N_back;	// checks the distance of the prime number behind n
			if(l1==l2)			// if distance is equal, print shorter number
			{
				System.out.println(N_back);
			}
			else if(l1<l2)
			{
				System.out.println(N_front);
			}
			else
			{
				System.out.println(N_back);
			}
		}
	}
}