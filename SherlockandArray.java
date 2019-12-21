import java.io.*;
import java.lang.*;
import java.util.*;
class SherlockandArray
{
	public static void main(String []args)
	{
		Scanner venki=new Scanner(System.in);
		int t=venki.nextInt();
		for(int T=0;T<t;T++)
		{
			int n=venki.nextInt();
			int a[]=new int[n];
			int i,sumr=0,suml=0,k;
			for(i=0;i<n;i++)
			{
				a[i]=venki.nextInt();
			}
			int flag=0;
			for(k=0;k<n;k++)
			{
				flag=0;
				sumr=0;
				suml=0;
				for(i=k+1;i<n;i++)
				{
					sumr+=a[i];
				}
				for(i=k-1;i>=0;i--)
				{
					suml+=a[i];
				}
				if(sumr==suml)
				{
					System.out.println("YES");
					flag=1;
					break;
				}
			}
			if(flag!=1)
			{
				System.out.println("NO");
			}
		}

	}
}