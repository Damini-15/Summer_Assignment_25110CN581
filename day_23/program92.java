import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        int max=0;char maxFreq = '\0';
        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();
        HashMap<Character,Integer> freq = new HashMap<>();

        for(char ch:s.toCharArray())
        {
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        for(char ch:s.toCharArray())
        {
            int f = freq.get(ch);
            if(f>max)
            {
                max = f;
                maxFreq = ch;
            }
        }

        System.out.println("Maximum frequency is of: "+maxFreq);
    }
}
