import java.io.*;
import java.lang.*;
import java.math.*;
class Encryption
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader (new InputStreamReader(System.in));
		String S=venki.readLine();
		int i,j,k=0,r=0,c=0,l=0;
		char ch[][]=new char[100][100];
		l=S.length();
		float L=(float)Math.sqrt(l);
		r=(int)Math.floor(L);
		c=(int)Math.ceil(L);
		
		if(r*c < l)
		{
			if(r<c)
			{
				while(r*c<l)
				{
					r++;
				}
			}
			if(c<r)
			{
				while(r*c<l)
				{
					c++;
				}
			}
		}
		k=0;
		if(l<r*c)
		{
			int flag=0;
			while(flag != l)
			{
				if(l<r*c)
				{
					S+=" ";
					l++;
				}
				if(l==r*c){ flag=1;
				break;}
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				ch[i][j]=(char)S.charAt(k);
				k=k+1;
			}
		}
		for(i=0;i<c;i++)
		{
			for(j=0;j<r;j++)
			{
				if(ch[j][i]!= ' ')
				{
				System.out.print(ch[j][i]);
				}
			}
			System.out.print(" ");
		}
		
	}
}