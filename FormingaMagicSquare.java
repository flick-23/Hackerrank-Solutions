import java.io.*;
import java.util.Scanner;
class FormingaMagicSquare
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int a[][]={{2,7,6},{9,5,1},{4,3,8}};
		int b[][]={{4,9,2},{3,5,7},{8,1,6}};
		int c[][]={{6,1,8},{7,5,3},{2,9,4}};
		int d[][]={{8,3,4},{1,5,9},{6,7,2}};
		int f[][]={{8,1,6},{3,5,7},{4,9,2}};
		int g[][]={{2,9,4},{7,5,3},{6,1,8}};
		int h[][]={{4,3,8},{9,5,1},{2,7,6}};
		int k[][]={{6,7,2},{1,5,9},{8,3,4}};
		int e[][]=new int[3][3];
		int i,j,A=0,B=0,C=0,D=0,F=0,G=0,H=0,K=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				e[i][j]=venki.nextInt();
				A+=Math.abs(a[i][j]-e[i][j]);
				B+=Math.abs(b[i][j]-e[i][j]);
				C+=Math.abs(c[i][j]-e[i][j]);
				D+=Math.abs(d[i][j]-e[i][j]);
				F+=Math.abs(f[i][j]-e[i][j]);
				G+=Math.abs(g[i][j]-e[i][j]);
				H+=Math.abs(h[i][j]-e[i][j]);
				K+=Math.abs(k[i][j]-e[i][j]);
			}	
		}
		//System.out.println("A :"+A+"\nB :"+B+"\nC :"+C+"\nD :"+D);
		int sort[]={A,B,C,D,F,G,H,K};
		int min=1000;
		for(i=0;i<8;i++)
		{
			if(sort[i]<min)
			{
				min=sort[i];
			}
		}
		System.out.println(min);
	}
}