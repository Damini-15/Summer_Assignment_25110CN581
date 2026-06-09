import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int fib(int n)
    {
        if(n==1 || n==0) return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        System.out.println("Fibonacci series is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(fib(i)+" ");
        }
    }
}
