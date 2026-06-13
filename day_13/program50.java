import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int sum(int arr[])
    {
        int s=0;
        for(int i=0;i<arr.length;i++)
        {
            s+=arr[i];
        }
        return s;
    }

    public static double avg(int sum,int arr[])
    {
        int l=arr.length-1;
        double average = sum/l;
        return average;
    }
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++)
        {
            a[i] = ob.nextInt();
        }

        int s=sum(a);
        System.out.println("sum is:"+s);
        System.out.println("Average is:"+avg(s,a));

    }
}
