import java.io.*;
import java.util.Scanner;
class DayOfPro
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int y=venki.nextInt();
		int d=0;
		
		if(y<1918)
		{
			if(y%4==0)
				d=215+29;
			else
				d=215+28;
			System.out.println(256-d+".09."+y);
		}
		else if(y>1918)
		{
			if((y%400==0)||(y%4==0 && y%100!=0))
				d=215+29;
			else
				d=215+28;
			System.out.println(256-d+".09."+y);
		
		}
		else
		{
			System.out.println("26.09.1918");
		}
	}
}