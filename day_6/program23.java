import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int binary = ob.nextInt();
        int count=0;
        while(binary>0)
        {
            if(binary%10==1) count++;
            binary/=10;
        }
        System.out.println("Set bits: "+count);
    }
}
