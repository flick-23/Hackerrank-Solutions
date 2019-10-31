import java.io.*;
import java.util.Scanner;
class AppleOrange
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int s=venki.nextInt();
		int t=venki.nextInt();
		int a=venki.nextInt();
		int b=venki.nextInt();
		int m=venki.nextInt();
		int n=venki.nextInt();
		int M[]=new int[m];int N[]=new int[n];
		int i,app=0,or=0,A=0,O=0;
		
		for(i=0;i<m;i++)
		{
			M[i]=venki.nextInt();
			app=M[i]+a;
			if(app>=s && app<=t)
				A++;
		}
		for(i=0;i<n;i++)
		{	
			N[i]=venki.nextInt();
			or=N[i]+b;
			if(or>=s && or<=t)
				O++;
		}
		System.out.println(A+"\n"+O);
	}
}
