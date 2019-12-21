import java.util.Scanner;
public class Non
{
    public static void main(String[] args) 
    {
        int n, flag = 0, count = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Non repeated elements are:");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i != j)
                {
                    if(a[i] != a[j])
                    {
                        flag = 1;
                    }
                    else
                    {
                        flag = 0;
                        break;
                    }
                }
            }
            if(flag == 1)
            {
                count++;
                System.out.print(a[i]+" ");
            }
        }
        System.out.println("");
        System.out.println("Number of non repeated elements are:"+count);
    }
}