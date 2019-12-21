import java.io.*;
import java.util.Scanner;
class Kangaroo 
{
	public static void main(String[]args)throws IOException
	{
		Scanner venki=new Scanner(System.in);
		int x1=venki.nextInt();
		int v1=venki.nextInt();
		int x2=venki.nextInt();
		int v2=venki.nextInt();
		int A=0,B=0,a=0,b=0,i,flag=0;
		/*if((x1<x2 && v1>v2) || (x1>x2 && v1<v2))
		{
			int A=x1+v1; int B=x2+v2;
			if(A>B)
			{
				if(A%B==0)
					System.out.println("YES");

			}
			if(B>A)
			{
				if(B%A==0)
				System.out.println("YES");

			}
		}
		else
			System.out.println("NO");*/
		int x=100000;
		A=x1+v1;
		B=x2+v2;
		a=1;
		b=1;
		for(i=0;i<100000;i++)
		{
			if(A==B && a==b)
			{
				flag=1;
				break;
			}
			A+=v1;
			B+=v2;
			a++;
			b++;
			
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
