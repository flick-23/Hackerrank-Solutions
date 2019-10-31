import java.io.*;
import java.util.Scanner;
import java.lang.*;
class AppendDelete
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		String s=venki.readLine();
		String t=venki.readLine();
		String S="",T="";
		int k=Integer.parseInt(venki.readLine());
		int l_s=s.length(),l_t=t.length(),c=0;
		int i,flag=0,K=0;
		
		if(l_s>l_t)
		{
			for(i=0;i<l_t;i++)
				S+=""+s.charAt(i);
			i=0;
			S=S+"1";
			t=t+"3";
			while(flag!=1)
			{
				if(S.charAt(i)==t.charAt(i))
					c++;
				else{
					flag=1;
				break;}
				i++;
			}
			K=(l_s-c)+(l_t-c);
		}
		else if(l_s<l_t)
		{
			for(i=0;i<l_s;i++)
				T+=""+t.charAt(i);
			i=0;
			T=T+"1";
			s=s+"3";
			while(flag!=1)
			{
				if(s.charAt(i)==T.charAt(i))
					c++;
				else{
					flag=1;
				break;}
				i++;
			}
			K=(l_s-c)+(l_t-c);
		}
		else if(l_s==l_t)
		{
			K=l_s;
		}
		if(k>=K)
		{
			System.out.println("Yes");
		}
		else if(k==K)
		{
			if(k%2==0)
				System.out.println("Yes");
			else 
				System.out.println("No");
		}
		else
		{
			System.out.println("No");
		}
		
	}
}