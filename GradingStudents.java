import java.io.*;
import java.util.Scanner;
class GradingStudents
{	
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int  a[]=new int[n],temp=0;
		for(int i=0;i<n;i++)
		{
			temp=0;
			a[i]=venki.nextInt();
			if(a[i]>=38)
			{
				temp=a[i];
				while(temp%5!=0)
				{
					temp++;
				}
				if((temp-a[i])<3)
					a[i]=temp;
			}
		}
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}
