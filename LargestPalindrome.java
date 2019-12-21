import java.io.*;
import java.util.Scanner;
class LargestPalindrome
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		int t,i,j,temp=0,r=0,rev=0,a[]=new int[100000],c=0;
		int pal[]=new int[T];
		for(t=0;t<T;t++)
		{
			int N=venki.nextInt();
			for(i=100;i<1000;i++)
			{
				for(j=100;j<=i;j++)
				{
					r=0;rev=0;
					int n=i*j;
					if(n>=101101 && n<=N)
					{
						temp=n;
						while(n!=0)
						{
							r=n%10;
							rev=rev*10+r;
							n=n/10;
						}
						if(temp==rev)
						{
							a[c]=temp;
							c++;
						}
					}
				}
			}
		
			for(i=0;i<c;i++)
			{
				for(j=i+1;j<c;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
				pal[t]=a[c-1];

		}
		for(i=0;i<T;i++)
			System.out.println(pal[i]);
		
		
	}
}