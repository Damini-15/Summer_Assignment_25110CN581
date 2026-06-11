import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int max(int [] arr)
    {
        int m=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>m) m=arr[i];
        }
        return m;
    }
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }

        System.out.println("Maximum is: "+max(a));
    }
}
