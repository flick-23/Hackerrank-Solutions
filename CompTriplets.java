import java.io.*;
import java.util.Scanner;
class CompTriplets
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int a[]=new int[3],b[]=new int[3];
		int i,j,A=0,B=0;
		for(i=0;i<3;i++)
			a[i]=venki.nextInt();
		for(i=0;i<3;i++)
			b[i]=venki.nextInt();
		for(i=0;i<3;i++)
		{
			if(a[i]>b[i])
				A++;
		     if(a[i]<b[i])
				B++;
		}
		System.out.println(A+" "+B);
		
	}
}