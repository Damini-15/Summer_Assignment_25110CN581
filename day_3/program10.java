import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean isPrime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0) return false;
        }

        return true;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner ob = new Scanner(System.in);
        int l = ob.nextInt();
        int h = ob.nextInt();

        for(int i=l;i<=h;i++)
        {
            if(isPrime(i)) System.out.print(i+" ");
        }

    }
}
