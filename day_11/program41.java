import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int sum(int x,int y)
    {
        return x+y;
    }
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
        System.out.println("Sum is: "+sum(a,b));
    }
}
