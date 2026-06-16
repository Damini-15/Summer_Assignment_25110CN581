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
        for(int i=0;i<n/2;i++)
        {
            int temp=a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
