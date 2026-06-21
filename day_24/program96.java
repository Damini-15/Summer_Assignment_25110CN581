import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();
        HashSet <Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for(char ch: s.toCharArray())
        {
            if(!set.contains(ch))
            {
                set.add(ch);
                result.append(ch);
            }
        }

        System.out.println("String after removing duplicates is: "+ result);
    }
}
