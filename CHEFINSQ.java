import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
class CHEFINSQ
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int t=venki.nextInt();
		for(int T=0;T<t;T++)
		{
			int i,j,count,n,k;
			n=venki.nextInt();
			k=venki.nextInt();
			int a[]=new int[n];
			for(i=0;i<n;i++)
				a[i]=venki.nextInt();
			for(i=0;i<n-1;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(a[i]>a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			int flag=0,min=0,c=0,x=0,max=0,f[]=new int[k];
			for(i=0;i<k;i++)
			{
				if(a[i]!=a[i+1] && i!=(k-1))
					flag=1;
				min+=a[i];
			}
			if(flag==0)
			{
				for(i=0;i<k;i++)
				{
					for(j=0;j<n;j++)
					{
						if(a[j]==a[i])
						{
							f[i]++;
						}
					}
					if(f[i]>max)
					{
						max=f[i];
					}
				}
				x=max;
			}
			else
			{
				for(i=0;i<n;i++)
				{
					count=0;
					for(j=i;j<n;j++)
					{
						c+=a[j];
						count++;
						if(count==k)
							break;
					}
					if(c==min)
						x++;
					c=0;
				}
			}
			System.out.println(x);
		}
	}
}