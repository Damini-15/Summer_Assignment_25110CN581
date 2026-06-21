import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int StrLength(String str)
    {
        int count=0;
        for(int i:str.toCharArray())
        {
            count++;
        }
        return count;
    }

    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();

        int l = StrLength(s);

        System.out.println("Length of string is: "+l);
    }
}
