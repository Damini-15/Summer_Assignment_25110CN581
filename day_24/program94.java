import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();
        StringBuilder compressed = new StringBuilder();
        int count=1;

        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1)) count++;
            else
            {
                compressed.append(s.charAt(i-1)).append(count);
                count=1;
            }
        }

        compressed.append(s.charAt(s.length() - 1)).append(count);
        System.out.println(compressed);
    }
}
