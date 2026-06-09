import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int reverse(int n,int rev)
    {
        if(n==0) return rev;
        rev=rev*10+(n%10);
        return reverse(n/10,rev);

    }
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        System.out.println("Reverse of number is: "+reverse(n,0));
    }
}
