import java.io.*;
import java.lang.*;
import java.util.*;
class  PointsOnaLine
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int f=0,F=0,X=0,Y=0;
		int x[]=new int[n];
		int y[]=new int [n];
		for(int i=0;i<n;i++)
		{
			x[i]=venki.nextInt();
			y[i]=venki.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			if(x[i]!=x[i+1])
			{
				f=1;
			}
			if(y[i]!=y[i+1])
			{
				F=1;
			}
		}
		if((f==0 && F==1)||(f==1 && F==0)||(f==0 && F==0))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}	
}