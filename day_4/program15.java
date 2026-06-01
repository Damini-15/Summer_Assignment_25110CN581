import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean arm(int n)
    {
        int digit,num=n,power=0,sum=0;
        while(n>0)
        {
            power++;
            n/=10;
        }
        n=num;
        while(n>0)
        {
            digit=n%10;
            sum+=Math.pow(digit,power);
            n/=10;
        }

        if(num==sum) return true;
        return false;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        if(arm(n)) System.out.println("Armstrong Number");
        else System.out.println("Not Armstrong Number");
    }
}
