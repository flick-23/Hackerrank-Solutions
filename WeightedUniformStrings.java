import java .io.*;
import java.util.*;
import java.lang.*;
class WeightedUniformStrings
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		String s=venki.next();
		int n=venki.nextInt();
		long x[]=new long[n],size[]=new long[200],sum[]=new long[100000];int c=0,flag=0,k=0,i,j;
		try
		{
			for(i=0;i<n;i++)
			{
				k=i;
				x[i]=venki.nextLong();
			}
		}
		catch (Exception e)
		{
			x[k]=venki.nextLong();
		}
		k=1;
		for(i=97;i<=122;i++)
		{
			size[i]=k;
			k++;
		}
		k=0;
		for(i=97;i<=122;i++)
		{
			c=0;
			flag=0;
			for(j=0;j<s.length();j++)
			{
				int ch=(int)s.charAt(j);
				if(ch==i)
				{
					c++;
				}
			}
			if(c>=1)
			{
				sum[k]=c*size[i];
				flag=1;
				k++;
			}
			if(flag==1)
			{
				while(c!=1)
				{
					c--;
					sum[k]=c*size[i];
					k++;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			flag=0;
			for(j=0;j<k;j++)
			{
				if(x[i]==sum[j])
				{
					System.out.println("Yes");
					//System.out.println("X[i] :"+x[i]);
					flag=1;
					break;
				}
			}
			if(flag!=1)
			{
				System.out.println("No");
				//System.out.println("X[i] :"+x[i]);
			}
		}
	}
}