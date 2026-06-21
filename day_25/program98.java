import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> common = new HashSet<>();

        for (char ch : s1.toCharArray())
        {
            set1.add(ch);
        }

        for (char ch : s2.toCharArray())
        {
            if (set1.contains(ch))
            {
                common.add(ch);
            }
        }

        System.out.println("Common characters: " + common);
    }
}
