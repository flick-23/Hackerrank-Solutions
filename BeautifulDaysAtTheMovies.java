import java.io.*;
import java.util.Scanner;
class BeautifulDaysAtTheMovies
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int I=venki.nextInt();
		int J=venki.nextInt();
		int K=venki.nextInt();
		int rev=0,temp=0,i,x=0,sum;
		for(i=I;i<=J;i++)
		{
			sum=0;
			temp=i;
			rev=0;
			while(temp!=0)
			{
				int r=temp%10;
				rev=rev*10+r;
				temp=temp/10;
			}
			sum=Math.abs(i-rev);
			if(sum%K==0)
				x++;
		}
		System.out.println(x);
	}
}