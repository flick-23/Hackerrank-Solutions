import java.io.*;
import java.lang.*;
class TimeConversion
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		String s=venki.readLine();
		
		char h1=s.charAt(0);
		String H=""+h1;
		
		char h2=s.charAt(1);
		String Hh=""+h2;
		
		String ch=""+H+Hh;
		int hh=Integer.parseInt(ch);
		
		if((s.charAt(8)=='P' || s.charAt(8)=='p')&&(hh!=12))
		{
				hh+=12;
		}
		String C=""+s.charAt(2)+s.charAt(3)+s.charAt(4)+s.charAt(5)+s.charAt(6)+s.charAt(7);
		if(hh<10)
			System.out.println("0"+hh+""+C);
		else if((s.charAt(8)=='A' || s.charAt(8)=='A')&&hh==12)
			System.out.println("00"+C);
		else
			System.out.println(hh+""+C);
			
	}
}