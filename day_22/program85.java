import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean isPalin(String str)
    {
        int n=str.length();
        for(int i=0;i<n/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-i-1))
            {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();

        if(isPalin(s)) System.out.println("Palindrome String");
        else System.out.println("Not Palindrome String");
    }
}
