import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        List <Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            int x = ob.nextInt();
            if(!list.contains(x)) list.add(x);
        }

        for(int i:list)
        {
            System.out.print(i+" ");
        }
    }
}
