import java.io.*;
import java.util.*;
class ServiceLane
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int T=venki.nextInt();
		int i,j,S[]=new int[n];
		for(i=0;i<n;i++)
		{
			S[i]=venki.nextInt();
		}
		for(int t=0;t<T;t++)
		{
			int a=venki.nextInt();
			int b=venki.nextInt();
			int A[]=new int[n];
			j=0;
			for(i=a;i<=b;i++)
			{
				A[j]=S[i];
				j++;
			}
			for(i=0;i<j-1;i++)
			{
				for(int p=i+1;p<j;p++)
				{
					if(A[i]>A[p])
					{
						int temp=A[i];
						A[i]=A[p];
						A[p]=temp;
					}
				}
			}
			System.out.println(A[0]);
			
		}
	}
	
}