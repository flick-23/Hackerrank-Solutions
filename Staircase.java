import java.io.*;
import java.util.Scanner;
class Staircase
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if((i+j)>=(n-1))
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}