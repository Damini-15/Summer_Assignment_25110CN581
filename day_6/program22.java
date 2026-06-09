import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner ob = new Scanner(System.in);
        int binary = ob.nextInt();
        int decimal=0,i=0;
        while(binary>0)
        {
            int digit = binary%10;
            decimal+=digit*Math.pow(2,i);
            binary/=10;
            i++;
        }
        System.out.println("Decimal equivalent:"+decimal);
    }
}
