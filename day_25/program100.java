import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String  words [] = s.split("\\s+");

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        for (String w : words)
        {
            System.out.println(w);
        }
    }
}
