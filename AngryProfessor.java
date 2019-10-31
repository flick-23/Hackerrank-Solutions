import java.io.*;
import java.util.Scanner;
class AngryProfessor
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		int N[]=new int[1000];
		String a[]=new String[T];
		int x,i;
		for(int t=0;t<T;t++)
		{
			x=0;
			int n=venki.nextInt();
			int k=venki.nextInt();
			for(i=0;i<n;i++)
				N[i]=venki.nextInt();
			for(i=0;i<n;i++)
			{
				if(N[i]<=0)
					x++;
			}
			if(x>=k)
				a[t]="NO";		
			else
				a[t]="YES";
		}
		for(i=0;i<T;i++)
			System.out.println(a[i]);
	}
}