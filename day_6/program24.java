import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static long power(int n,int x)
    {
        long result=n;
        while(x-->1)
        {
            result*=n;
        }
        return result;
    }
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int pow = ob.nextInt();

        long ans = power(n,pow);
        System.out.println(n+"^"+pow+"= "+ans);
    }
}
