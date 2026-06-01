import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int lcm(int a,int b)
    {
        int g = Math.max(a,b);
        int s = Math.min(a,b);

        for(int i=g;i<=a*b;i+=g)
        {
            if(i%s==0) return i;
        }

        return a*b;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        int b = ob.nextInt();

        System.out.println("LCM of given numbers is: "+lcm(a,b));
    }
}
