import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String names [] = new String[n];

        for (int i = 0; i < n; i++)
        {
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);

        System.out.println("Sorted names:");

        for (String s : names)
        {
            System.out.println(s);
        }
    }
}
