import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean isArm(int n)
    {
        int power=0,sum=0,num=n;
        while(n>0)
        {
            power++;
            n/=10;
        }
        n=num;
        while(n>0)
        {
            int digit=n%10;
            sum+=Math.pow(digit,power);
            n/=10;
        }
        if(sum==num) return true;
        return false;
    }
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        if(isArm(n)) System.out.println("Armstrong Number");
        else System.out.println("Not a Armstrong Number");
    }
}
