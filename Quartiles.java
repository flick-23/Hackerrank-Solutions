import java.io.*;
import java.util.Scanner;
import java.lang.*;
class Quartiles
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int a[]=new int[n];
		int l[]=new int[n],u[]=new int[n],L,U;
		int q1=0,q2=0,q3=0,i,j=0,t=0,T=0,tt=0,x=0,temp=0,m=0;
	
		for(i=0;i<n;i++)
			a[i]=venki.nextInt();
		
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		j=0;
		if(n%2!=0)
		{
			L=(int)n/2;
			for(i=0;i<L;i++)
			{
				l[i]=a[i];
				j++;
			}
			
			for(i=L+1;i<n;i++)
				u[i]=a[i];
			
			q2=a[L];
			
			if(j%2!=0)
			{
				temp=(int)j/2;
				q1=a[temp];
				x=(int)(n/2)+(L/2)+1;
				q3=a[x];
			}
			if(j%2==0)
			{
				t=(int)L/2;T=(int)((L/2)-1);tt=(int)((L/2)+(n/2));
				q1=(int)((a[t]+a[(T)])/2);
				q3=(int)((a[tt]+a[tt+1])/2);
			}
		}
		if(n%2==0)
		{
			L=(int)n/2;
			for(i=0;i<L;i++)
			{
				l[i]=a[i];
				j++;
			}
	
			for(i=L;i<n;i++)
				u[i]=a[i];
			
			m=(int)n/2;
			q2=(int)((a[m]+a[m-1]))/2;
			
			if(j%2!=0)
			{
				temp=(int)j/2;
				q1=a[temp];
				x=(int)((n/2)+(L/2));
				q3=a[x];
			}
			if(j%2==0)
			{
				 t=(int)L/2;T=(int)((L/2)-1);tt=(int)((L/2)+(n/2));
				q1=(int)(a[t]+a[(T)])/2;
				q3=(int)(a[tt]+a[tt-1])/2;
			}
		}
		System.out.println(q1+"\n"+q2+"\n"+q3);
	}
}