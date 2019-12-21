import java.io.*;
import java.util.Scanner;
class HackerRankinaString
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int q=Integer.parseInt(venki.readLine());
		for(int Q=0;Q<q;Q++)
		{
			String s=venki.readLine();
			int i,c=0,H=0,A=0,C=0,E=0,R=0,N=0,K=0;
			char ch;
			for(i=0;i<s.length();i++)
			{
				ch=s.charAt(i);
				if(ch=='h')
				{
					H++;
				}
				else if(ch=='a')
				{
					A++;
				}
				else if(ch=='c')
				{
					C++;
				}
				else if(ch=='k')
				{
					K++;
				}
				else if(ch=='e')
				{
					E++;
				}
				else if(ch=='r')
				{
					R++;
				}
				else if(ch=='n')
				{
					N++;
				}
			}
			System.out.println("H :"+H+", A :"+A+", C :"+C+", K :"+E+", R :"+R+", N :"+N);
			if(H>=1 && A>=2 && C>=1 && K>=2 && E>=1 && R>=2 && N>=1)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}