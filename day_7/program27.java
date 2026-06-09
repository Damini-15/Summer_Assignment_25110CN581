import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int sum(int n)
    {
        if(n==0) return 0;
        int digit = n%10;
        return digit+sum(n/10);

    }
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        System.out.println("Sum of digits is: "+sum(n));
    }
}
