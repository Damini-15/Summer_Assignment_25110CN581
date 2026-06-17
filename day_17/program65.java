import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int [] merge (int a[],int b[])
    {
        int n1=a.length, n2=b.length;
        int c[] = new int [n1+n2];
        for(int i=0;i<n1;i++)
        {
            c[i] = a[i];
        }
        int x=0;
        for(int i=n1;i<n1+n2;i++)
        {
            c[i] = b[x++];
        }

        return c;
    }
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n1 = ob.nextInt();
        int n2 = ob.nextInt();

        int a[] = new int [n1];
        int b[] = new int [n2];


        for(int i=0;i<n1;i++)
        {
            a[i] = ob.nextInt();
        }
        for(int i=0;i<n2;i++)
        {
            b[i] = ob.nextInt();
        }

        int ans[] = merge(a,b);

        for(int i=0;i<n1+n2;i++)
        {
            System.out.print(ans[i]+" ");
        }

    }
}
