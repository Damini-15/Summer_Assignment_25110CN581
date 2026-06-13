import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean perfect(int n)
    {
        int sum=0;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                if(n!=i) sum+=i;
                int pair=n/i;
                if(pair!=n && pair!=i) sum+=pair;
            }

        }
        if(sum==n) return true;
        return false;
    }
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        if(perfect(n)) System.out.println("Perfect Number");
        else System.out.println("Not a Perfect Number");
    }
}
