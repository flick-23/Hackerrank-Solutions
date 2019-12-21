import java.io.*;
import java.util.*;
class ClimbingtheLeaderboard
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int i,j,b=0,N=n+1;
		long scores[]=new long[N];
		for(i=0;i<n;i++)
		{
			scores[i]=venki.nextLong();
		}
		int m=venki.nextInt();
		long alice[]=new long[m],S[]=new long[N];
		for(i=0;i<m;i++)
		{
			alice[i]=venki.nextLong();
		}
		try
		{
			for(i=0;i<N;i++)
			{
				if(scores[i]!=scores[i+1])
				{
					S[b]=scores[i];
					b++;
				}
			}
		}
		catch (Exception e)
		{
			S[b]=scores[i];
		}
		for(i=0;i<m;i++)
		{
			int flag=0;
			int c=1;
			for(j=0;j<b;j++)
			{
				if(alice[i]>=S[j])
				{
					System.out.println(c);
					flag=1;
					break;
				}
				c++;
			}
			if(flag!=1)
			{
				System.out.println(b+1);
			}
		}
		
	}
}