import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        if(n==2)
        {
            return true;
        }
        for(int i=3;i<Math.sqrt(n);i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        if(isPrime(n)) System.out.println("Prime Number");
        else System.out.println("Not a prime number");
    }
}
