import java.io.*;
import java.util.Scanner;
class BetweenTwoSets
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int m=venki.nextInt();
		int C=0,t=0,i,j,k,g=0,c=0,x=0,s,a[]=new int[n],b[]=new int[m];
		for(i=0;i<n;i++)
		{
			a[i]=venki.nextInt();
		}
		for(j=0;j<m;j++)
		{
			b[j]=venki.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=1;j<=100;j++)
			{
				x=j%a[i];
				if(x==0)
				{
					System.out.println("A[i] :"+a[i]+" J :"+j);
					for(int l=0;l<n;l++)
					{
						if(a[l]==j)
						{
							C++;
						}
					}
					for(k=1;k<=100;k++)
					{
						t=j*k;
						for(s=0;s<m;s++)
						{
							if(t==b[s])
							{
								/*c++;*/
								System.out.println("T :"+t);
								for(int l=0;l<n;l++)
								{
									if(a[l]==j)
									{
										c++;
									}
								}
							}
						}
					}
					if(c==m)
					{
						c=0;
						g++;
						C++;
						C=0;
					
					}
				}
			}
			
		}
		System.out.println(g);
	}
}