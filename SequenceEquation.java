import java.io.*;
import java.util.Scanner;
class SequenceEquation
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int a[]=new int[50];
		int i,t,pos=0,p;
		for(i=1;i<=n;i++){
		a[i]=venki.nextInt();}	
		for(i=1;i<=n;i++)
		{
			pos=0;p=0;
			for(t=1;t<=n;t++)
			{
				if(a[t]==i)
					pos=i;
			}
			for(t=1;t<=n;t++)
			{
				if(a[t]==pos)
					p=t;
			}
			System.out.println(p);
		}
	}
}
