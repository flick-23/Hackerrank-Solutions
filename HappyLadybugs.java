import java.io.*;
import java.util.Scanner;
class HappyLadybugs
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		int t,i,j,f=0,c=0,temp=0,flag=0,k=0,p=0;
		int n;int a[]=new int[10000],A[]=new int[10000];
		String ch[]=new String[10000];
		int g=Integer.parseInt(venki.readLine());
		for(t=0;t<g;t++)
		{
			flag=0;k=0;c=0;
			n=Integer.parseInt(venki.readLine());
			String str=venki.readLine();
			for(i=0;i<n;i++)
			{
				a[i]=(int)str.charAt(i);
			}
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
			for(i=0;i<n;i++)
			{
				c++;
				A[i]=a[i];
			}
	
			for(i=0;i<c;i++)
			{
				f=0;
				for(j=0;j<c;j++)
				{
					if(A[i]==A[j])
					{
						f++;
					}
				}
				if(f<2)
				{
					flag=1;
				}
				if(f>=2)
				{
					k=1;
				}
			}
			
			if(a[0]=='_')
			{
				ch[t]="YES";
			}
			if(p!=1)
			{
				ch[t]="NO";
			}
			if(flag!=1 && k==1)
			{
				ch[t]="YES";
			}
			else if(flag==1)
			{
				ch[t]="NO";
			}
		}
		for(i=0;i<g;i++)
		{
			System.out.println(ch[i]);
		}
	}
}