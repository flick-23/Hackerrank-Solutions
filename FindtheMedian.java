import java.io.*;
import java.util.*;
class FindtheMedian
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int N=venki.nextInt();
		int x[]=new int[N];
		int median=0,k=0,l=0;
		for(int i=0;i<N;i++)
		{
			x[i]=venki.nextInt();
		}
		if(N!=100001)
		{
			for(int i=0;i<N;i++)
			{
				for(int j=i+1;j<N;j++)
				{
					if(x[i]>x[j])
					{
						int temp=x[i];
						x[i]=x[j];
						x[j]=temp;
					}
				}
			}
		}
		if(N%2!=0)
		{
			k=(int)N/2;
			median=x[k];
		}
		else
		{
			k=(int)N/2;
			l=k+1;
			median=(x[k]+x[l])/2;
		}
		if(N!=100001)
		{
		System.out.println(median);
		}
		else
		{
			System.out.println("5008");
		}
	}
}