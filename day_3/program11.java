import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int gcd(int a,int b)
    {
        return (b==0)?a:gcd(b,a%b);
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        int b = ob.nextInt();

        System.out.println("GCD of given numbers is: "+gcd(a,b));
    }
}
