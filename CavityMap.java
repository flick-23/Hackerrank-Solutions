import java.io.*;
import java.lang.*;
import java.util.Scanner;
class CavityMap
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(venki.readLine());
		String grid[]=new String[n];
		int i,j,x=0,a[][]=new int[n][n];
		int row=0,col=0;
		int l,m,k,o,p,q,r,t;
		for(i=0;i<n;i++)
		{
			grid[i]=venki.readLine();
		}
		if(n<3)
		{
			for(i=0;i<n;i++)
			{
			System.out.println(grid[i]);
			}
		}
		else
		{
			for(i=0;i<n;i++)
			{
				String s=grid[i];
				for(j=0;j<n;j++)
				{
					char c=s.charAt(j);
					a[i][j]=Character.getNumericValue(c);
				}
			}	
			for(i=1;i<n-1;i++)
			{
				for(j=1;j<n-1;j++)
				{
					if((i!=0)&&(j!=0)&&(i!=(n-1))&&(j!=(n-1)))
					{
						x=a[i][j];
						k=a[i][j+1];
						o=a[i][j-1];
						p=a[i+1][j];
						q=a[i-1][j];
		
						System.out.println("\nX :"+x+"\nK :"+k+"\nO :"+o+"\nP :"+p+"\nQ :"+q+"\n");
						if(x>k) 
						{
							if(x>o)
							{
								if(x>p)
								{
									if(x>q)
									{
										a[i][j]=11;
										char ch=grid[i].charAt(j);
										grid[i]=grid[i].replace(ch,'X');
									}
								}
							}
						}
					}
				}
			}
			for(i=0;i<n;i++)
			{
				System.out.println(grid[i]);
			}
		}
	}
}