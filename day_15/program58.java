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
        int first = a[0];

        for(int i=0;i<n-1;i++)
        {
            a[i] = a[i+1];
        }
        a[n-1] = first;
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
