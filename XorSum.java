import java.io.*;
import java.util.Scanner;
class XorSum
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		long A[]=new long[1000000],F[]=new long[1000000];
		int L,R,i,t;
		long xor=0;
		
		A[0]=0;
		for(i=1;i<=100000;i++)
			A[i]=A[i-1]^i;
		
		for(t=0;t<T;t++)
		{
			L=venki.nextInt();
			R=venki.nextInt();
			xor=A[L]^A[L+1];
			for(i=L+2;i<=R;i++)
			{
				xor^=A[i];
			}
			F[t]=xor;
		}
		for(i=0;i<T;i++)
			System.out.println(F[i]);
	}
}