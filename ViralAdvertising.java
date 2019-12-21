import java.io.*;
import java.util.Scanner;
class ViralAdvertising
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int cum=0,shared=5,liked;
		for(int i=1;i<=n;i++)
		{
			liked=(int)Math.floor(shared/2);
			cum+=liked;
			shared=liked*3;
		}
		System.out.println(cum);
	}
}