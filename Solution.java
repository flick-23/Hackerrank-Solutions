import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) 
    {
        String smallest = "";
        String largest = "";
        int i,flag=0,j,a=0,b=0;
        String S[]= new String [100000];

        for(i=0;i<s.length();i++)
        {
                flag=0;
                for(j=0;j<s.length();j++)
                {
                        int G=(int)s.charAt(i);
                        int H=(int)s.charAt(j);
                        if(G<H)
                        {
                                flag++;
                                S[i]+=""+s.charAt(j);
                        }
                        if(flag==k)
                        {
                                break;
                        }
                }
        }
		for( i=0;i<s.length();i++)
		{
			System.out.println(S[i]);
		}
        smallest=""+S[0];
        largest=""+S[s.length()-1];
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}