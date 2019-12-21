import java.io.*;
import java.util.Scanner;
class BonAp
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int k=venki.nextInt();
		int bill[]=new int[n];
		int i;
		for(i=0;i<n;i++)
			bill[i]=venki.nextInt();
		int tot=venki.nextInt();
		int sum=0;
		for(i=0;i<n;i++)
		{
			sum+=bill[i];
		}
		sum=sum-bill[k];
		int act=tot-(sum/2);
		if(act==0)
			System.out.println("Bon Appetit");
		else
			System.out.println(act);
	}
}