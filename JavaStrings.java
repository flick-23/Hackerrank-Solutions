import java.io.*;
import java.util.*;
import java.lang.*;
public class JavaStrings 
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
        String A=venki.readLine();
        String B=venki.readLine();
        int la=A.length();
        int lb=B.length();
        System.out.println((la+lb));
		int i=0,k=0,flag=0;
        int a=(int)A.charAt(0);
		int b=(int)B.charAt(0);
		if(a<b)
		{
			System.out.println("No");
		}
		else if(a>b)
		{
			System.out.println("Yes");
		}
		else if(A.equals(B))
		{
			System.out.println("No");
		}
		else
		{		k=-1;
				if(la<lb)
				{
					for(i=0;i<la;i++)
					{
						a=(int)A.charAt(i);
						b=(int)B.charAt(i);
						if(a==b)
						{
							k++;
						}
						if(a!=b)
						{
							flag=1;
							break;
						}
					}
				}
				else if(la>lb)
				{
					for(i=0;i<lb;i++)
					{
						a=(int)A.charAt(i);
						b=(int)B.charAt(i);
						if(a==b)
						{
							k++;
						}
						if(a!=b)
						{
							flag=1;
							break;
						}
					}
				}
			
			a=(int)A.charAt(k);
			b=(int)B.charAt(k);
			if(a<b)
			{
				System.out.println("No");
			}
			else if(a>b)
			{
				System.out.println("Yes");
			}
			if(a==b)
			{
				System.out.println("No");
			}
		}
        a=(int)A.charAt(0);
		b=(int)B.charAt(0);
		a=a-32;
		b=b-32;
		char ch=(char)a;
		char ch1=(char)b;
		String s1=""+ch;
		String s2=""+ch1;
		for(i=1;i<A.length();i++)
		{
			s1+=A.charAt(i);
		}
		for(i=1;i<B.length();i++)
		{
			s2+=B.charAt(i);
		}
		System.out.println(s1+" "+s2);
    }
}



