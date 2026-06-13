import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean isPalin(int n)
    {
        int rev=0,num=n;
        while(n>0)
        {
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        if(rev==num) return true;
        return false;
    }
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        if(isPalin(n)) System.out.println("Palindrome Number");
        else System.out.println("Not a Palindrome Number");
    }
}
