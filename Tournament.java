import java.io.*;
import java.lang.*;
class Tournament 
{
    public static void main(String args[] ) throws IOException 
    {
        BufferedReader venki = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(venki.readLine());
        int x=0;int S[]=new int[T];
		int N;String s2,s1;
        for(int t=0;t<T;t++)
        {
            x=0;
            N=Integer.parseInt(venki.readLine());
            s1=venki.readLine();
            s2=venki.readLine();
            for(int i=0;i<N;i++)
            {
                for(int j=0;j<N;j++)
                {
                    if(s1.charAt(j)==s2.charAt(i))
                    {
                        x++;
                        break;
                    }
                }
            }
            S[t]=x;
        }
        for(int i=0;i<T;i++)
        System.out.println(S[i]);
    }
}
