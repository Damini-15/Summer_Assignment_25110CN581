import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++)
        {
            a[i] = ob.nextInt();
        }
        HashSet <Integer> unique = new HashSet<>();
        HashSet <Integer> duplicate = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            if(!unique.add(a[i]))
            {
                duplicate.add(a[i]);
            }
        }

        System.out.println("Duplicates are:"+duplicate);
    }
}
