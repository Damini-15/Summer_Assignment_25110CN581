import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        int x=0,y=0;
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int sum = ob.nextInt();
        int a[] = new int [n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            a[i] = ob.nextInt();
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }

        for(int i:map.keySet())
        {
            int diff = sum-i;
            if(diff==i)
            {
                if(map.get(i)>=2)
                {
                    x=y=i;
                }
            }
            else
            {
                if(map.containsKey(diff))
                {
                    x=i;
                    y=diff;
                }
            }
        }

        System.out.println("Pair is:"+x+" "+y);

    }
}
