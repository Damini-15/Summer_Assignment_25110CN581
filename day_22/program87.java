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

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        System.out.println("Frequency of each character is: ");
        for(char ch:freq.keySet())
        {
            System.out.println(ch+" = "+freq.get(ch));
        }
    }
}
