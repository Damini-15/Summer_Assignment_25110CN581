import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++)
        {
            a[i] = ob.nextInt();
        }
        int last = a[n-1];

        for(int i=n-1;i>=1;i--)
        {
            a[i] = a[i-1];
        }
        a[0] = last;
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
