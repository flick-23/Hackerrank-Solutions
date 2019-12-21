import java.io.*;
import java.util.Scanner;
class Array2D
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int a[][]=new int[6][6];
		int n=0,m=0,k=0,row=0,col=0,x=0,sum=0,ans=0,temp=0, ANS=-1000,flag=0;
		
		for(int i=0;i<6;i++)
			for(int j=0;j<6;j++)
				a[i][j]=venki.nextInt();
			
		for(row=0;row<4;row++)
		{
			k=0;
			temp=0;
			while(k!=4)
			{
				col=temp;
				m=(col+(col+2))/2;
				sum=0;
				sum+=a[row+1][m];
				n=0;
				while(n!=3)
				{
					sum+=a[row][col];
					sum+=a[row+2][col];
					col++;
					n++;
				}
				k++;
				if(sum>0)
				{
					if(sum>ans)
					{
						ans=sum;
					}
				}
				else if(sum==0)
				{
					x=1;
				}
				else if(sum<0)
				{
					flag=1;
					if(sum>ANS)
						ANS=sum;
				}
				temp++;
			}
		}
		if(ans==0 && x==1)
		{
			System.out.println(ans);
		}
		else if(ans==0 && flag==1)
		{
			System.out.println(ANS);
		}
		else if((ans>ANS) && (ans!=0))
		{
			System.out.println(ans);
		}
		
	}
}