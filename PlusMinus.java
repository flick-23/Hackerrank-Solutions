import java.io.*;
import java.util.Scanner;
class PlusMinus
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int arr[]=new int[n];
		float pos=0,neg=0,zero=0;
		float P=0,N=0,Z=0;
		
		for(int i=0;i<n;i++)
		{
			arr[i]=venki.nextInt();
			if(arr[i]>0)
				pos++;
			else if(arr[i]<0)
				neg++;
			else
				zero++;
		}
		P=pos/n;
		N=neg/n;
		Z=zero/n;
		System.out.println(P+"\n"+N+"\n"+Z);
	}
}