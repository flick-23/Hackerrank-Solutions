import java .io.*;
import java.util.*;
import java.lang.*;
class HalloweenSale
{
        public static void main(String[]args)
        {
                Scanner venki=new Scanner(System.in);
                int p=venki.nextInt();
                int d=venki.nextInt();
                int m=venki.nextInt();
                int s=venki.nextInt();
                int c=0,flag=0;
                while(s>0 && (s-p)>=0)
                {
                        c++;
                        s-=p;
						if(flag==1)
						{
							p=m;
						}
                        else if(p>m)
                        {
                                p=p-d;
                                if(p<m)
                                {
                                    p=m;
									flag=1;
                                }
                        }
                }
                System.out.println(c);
        }
}