import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
class NUM239
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		for(int t=0;t<T;t++)
		{
			int c=0;
			int l=venki.nextInt();
			int r=venki.nextInt();
			for(int i=l;i<=r;i++)
			{
				if(i%10==2 || i%10==3 || i%10==9)
				{
					c++;
				}
			}
			System.out.println(c);
		}
	}
}