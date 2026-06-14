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
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(max<a[i]) max=a[i];
        }
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]<max && a[i]>max2) max2=a[i];
        }

        System.out.println("Second largest element is:"+max2);
    }
}
