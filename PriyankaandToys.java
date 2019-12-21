import java.io.*;
import java.util.Scanner;
import java.lang.*;
class PriyankaandToys
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int a[]=new int[100000],m=0,k=0,i,j,temp=0,f=0;
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
	
		m=0;int flag=0;
		while(m!=n-1)
		{
			flag=0;
			int x=a[m]+4;
			if(a[m]<x){
			while(flag!=1)
			{
				if(m==n){
					f=1;
			break;}
				m++;
					
					if(a[m]>x){flag=1;
					break;}
			}}
			k++;
			if(f==1)
				break;

		}
		System.out.println(k);
	}
}