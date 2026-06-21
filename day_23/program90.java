import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine().trim();
        HashMap <Character,Integer> freq = new HashMap<>();
        for(char ch:s.toCharArray())
        {
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(freq.get(ch) > 1)
            {
                System.out.println("First repeating character is: "+ch);
                break;
            }
        }
    }
}
