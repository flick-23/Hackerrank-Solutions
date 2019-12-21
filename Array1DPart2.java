import java.io.*;
import java.util.Scanner;
class Array1DPart2
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int q=venki.nextInt();
		int i,x=0,flag=0;
		for(int t=0;t<q;t++)
		{
			int n=venki.nextInt();
			int a[]=new int[n];
			int leap=venki.nextInt();
			for(i=0;i<n;i++)
			{
				a[i]=venki.nextInt();
			}
			i=0;x=0;flag=0;
			for(int j=0;j<n;j++)
			{
				try
				{
					x=i-1;
					if(a[i+leap]==0)
					{
						i=i+leap;
						continue;
					}
					else if(x>0)
					{
						if(a[i-1]==0)
						{
							i=i-1;
							continue;
						}
					}
					else if(a[i+1]==0)
					{
						i=i+1;
						continue;
					}
					else
					{
						flag=2;
						break;
					}
					x=i;
				}
				catch(Exception e)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}