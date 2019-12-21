import java.io.*;
import java.util.*;
class CaesarCipher
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int l=Integer.parseInt(venki.readLine());
		String s=venki.readLine();
		int k=Integer.parseInt(venki.readLine());
		int sum=0,chr=0,flag;
		for(int i=0;i<l;i++)
		{
			flag=0; chr=0; sum=0;
			int ch=(int)s.charAt(i);
			if(ch>=97 && ch<=122)
			{
				sum=ch+k;
				if(sum>122)
				{
					if(k>26)
					{	
						chr=ch+26;
						while(flag!=1)
						{
							if(Math.abs(chr-sum)<26)
							{
								sum=ch+(Math.abs(chr-sum));
								if(sum>122)
								{
									sum-=122;
									ch=sum+96;
								}
								else
								{
									ch=sum;
								}
								flag=1;
								break;
							}
							chr=chr+26;
						}
					}
					else 
					{
						sum-=122;
						ch=96+sum;
					}
				}
				else
				{
					ch+=k;
				}
			}
			else if(ch>=65 && ch<=90)
			{
				sum=ch+k;
				if(sum>90)
				{
					chr=ch+26;
					if(k>26)
					{	
						while(flag!=1)
						{
							if(Math.abs(chr-sum)<26)
							{
								sum=ch+(Math.abs(chr-sum));
								if(sum>90)
								{
									sum-=90;
									ch=sum+64;
								}
								else
								{
									ch=sum;
								}
								flag=1;
								break;
							}
							chr+=26;
						}
					}
					else 
					{
						sum-=90;
						ch=64+sum;
					}
				}
				else
				{
					ch+=k;
				}
			}
			char c=(char)ch;
			System.out.print(c);
		}
	}
}