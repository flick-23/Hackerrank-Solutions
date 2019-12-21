import java.io.*;
import java.lang.*;
import java.util.*;
class  MDL
{
	public static void main(String[]args)throws IOException
	{
		//BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		Scanner venki=new Scanner(System.in);
		//StringTokenizer tk1 = new StringTokenizer(venki.readLine());
		int T=venki.nextInt();
		for(int t=0;t<T;t++)
		{
			int n=venki.nextInt();
			int i,j,a[]=new int[n],max=-1,min=9999,p=0,P=0;
			for(i=0;i<n;i++)
				a[i]=venki.nextInt();
			for(i=0;i<n;i++)
			{
					if(a[i]<min)
					{
						min=a[i];
						p=i;
					}
					if(a[i]>max)
					{
						max=a[i];
						P=i;
					}
			}
			if(p<P)
				System.out.println(a[p]+" "+a[P]);
			else
				System.out.println(a[P]+" "+a[p]);
			//System.out.println(a[p]+" "+a[P]);
		}	
	}
}