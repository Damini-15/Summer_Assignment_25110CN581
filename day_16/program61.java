import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        int sum=0;
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++)
        {
            a[i] = ob.nextInt();
            sum+=a[i];
        }
        sum-=a[n-1];
        int expectedSum = n*(n+1)/2;
        int element = expectedSum-sum;
        System.out.println("Missing element is:"+ element);
    }
}
