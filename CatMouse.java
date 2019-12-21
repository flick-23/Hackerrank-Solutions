import java.io.*;
import java.util.Scanner;
class CatMouse
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		for(int i=0;i<T;i++)
		{
			int a=venki.nextInt();
			int b=venki.nextInt();
			int c=venki.nextInt();
			int A=Math.abs(c-a);
			int B=Math.abs(c-b);
			if(A>B)
				System.out.println("Cat B");
			else if(B>A)
				System.out.println("Cat A");
			else 
				System.out.println("Mouse C");
		}
	}
}