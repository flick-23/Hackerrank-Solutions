import java.io.*;
import java.util.Scanner;
import java.lang.*;
class Interquartiles
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int x[]=new int[1000],f[]=new int[1000],a[]=new int[1000];
	int i,j,temp,k=0,l[]=new int[1000],u[]=new int[1000],L=0,c,m=0;
		float q1=0,q3=0,inq=0;
		
		for(i=0;i<n;i++)
		{
			x[i]=venki.nextInt();
		}
		for(i=0;i<n;i++)
		{
			f[i]=venki.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			c=0;
			while(c!=f[i])
			{
				a[k]=x[i];
				k++;
				c++;
			}
		}
		for(i=0;i<k-1;i++)
		{
			for(j=i+1;j<k;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		L=(int)k/2;
		m=(int)L/2;
		if(k%2==0)
		{
			for(i=0;i<L;i++)
			{
				l[i]=a[i];
			}
			c=L;
			for(i=0;i<L;i++)
			{
				u[i]=a[c];
				c++;
			}
		}
		if(k%2!=0)
		{
			for(i=0;i<L;i++)
			{
				l[i]=a[i];
			}
			c=L+1;
			for(i=0;i<L;i++)
			{
				u[i]=a[c];
				c++;
			}	
		}
		if(L%2==0)
		{
			q1=(float)(l[m]+l[m-1])/2;
			q3=(float)(u[m]+u[m-1])/2;
		}
		if(L%2!=0)
		{
			q1=(float)l[m];
			q3=(float)u[m];
		}
		inq=q3-q1;
		inq=Math.round(inq*10);
		System.out.println(inq/10);
	}
}