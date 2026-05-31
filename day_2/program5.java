import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int sum=0;
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();

        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }

        System.out.println("Sum is:"+sum);

    }
}
