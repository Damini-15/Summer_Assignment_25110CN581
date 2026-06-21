import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();
        String longest = "";

        String[] words = s.trim().split("\\s+");

        for (String word : words)
        {
            if (word.length() > longest.length())
            {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
        System.out.println("Length: " + longest.length());

    }
}
