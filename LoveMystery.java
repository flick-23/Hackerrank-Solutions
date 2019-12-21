import java.io.*;
import java.util.Scanner;
import java.lang.*;
class LoveMystery
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		String s,r=""; int l=0,a[]=new int[100000]; 
		int c,i;
		for(i=0;i<T;i++)
		{
			c=0;r="";
			s=venki.next();
			l=s.length();
			for(int j=l-1;j>=0;j--)
			{
				r+=s.charAt(j);
			}
			if(r.equals(s)){
			c=0;}
			else if(l%2==0){
			c=l;}
			else if(l%2!=0){
			c=l-1;}
			a[i]=c;
		}
		for(i=0;i<T;i++);
		System.out.println(a[i]);
	}
}
