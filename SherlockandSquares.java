import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
class  SherlockandSquares
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int q=venki.nextInt();
		for(int Q=0;Q<q;Q++)
		{
			int c=0;
			double a=venki.nextDouble();
			double b=venki.nextDouble();
			for(double i=a;i<=b;i++)
			{
				double sq=Math.sqrt(i);
				double n=Math.floor(sq);
				double m=n+1;
				if(!(sq>n && sq<m))
				{
					c++;
				}	
			}
			System.out.println(c);
			System.out.println("Q :"+q);
		}
	}	
}