import java.io.*;
import java.util.Scanner;
import java.lang.*;
class LibraryFine
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int d1=venki.nextInt();
		int m1=venki.nextInt();
		int y1=venki.nextInt();
		int d2=venki.nextInt();
		int m2=venki.nextInt();
		int y2=venki.nextInt();
		int fine=0;
		if(y1<=y2 && m1<=m2 && d1<=d2)
		{
			fine=0;
		}
		else if(y1==y2 && m1>m2)
		{
			fine=500*(Math.abs(m1-m2));
		}
		else if(y1==y2 && m1==m2 && d1>d2)
		{
			fine=15*(d1-d2);
		}
		else if(y1 > y2)
		{
			fine=10000;
		}
		else
		{
			fine=0;
		}
		System.out.println(fine);
	}
}
