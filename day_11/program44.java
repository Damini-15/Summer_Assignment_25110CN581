import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int fact(int n)
    {
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        System.out.println("Factorial is: "+fact(n));
    }
}
