import java.io.*;
import java.util.*;
class BitwiseAND
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int t=venki.nextInt();
		for(int T=0;T<t;T++)
		{
		int n=venki.nextInt();
		int k=venki.nextInt();
		int i,j,A=0,and=0;
        for(i=1;i<n;i++)
        {
            for(j=i+1;j<=n;j++)
            {
                and=i & j;              
                if(and>A && and<k)
                {
                    A=and;
                }
			}
        }
        System.out.println(A);
		}
	}
}