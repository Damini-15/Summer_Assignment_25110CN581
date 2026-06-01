import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int fib(int n)
    {
        if(n==0 || n==1) return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        System.out.println("Nth fibonacci term is: "+fib(n-1));
    }
}
