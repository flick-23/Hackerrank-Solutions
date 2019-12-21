import java.io.*;
import java.util.Scanner;
import java.math.BigInteger;
class LongFactorial
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		double f=1; int i;
		for(i=1;i<=n;i++)
			f*=i;
		System.out.println(f);
	}
}