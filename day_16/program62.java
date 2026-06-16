import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        int ans=0;
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        int a[] = new int [n];
        HashMap <Integer, Integer> freq = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            a[i] = ob.nextInt();
            freq.put(a[i],freq.getOrDefault(a[i],0)+1);
        }
        int maxFreq=0;
        for(int i=0;i<n;i++)
        {
            if(freq.get(a[i])>maxFreq) maxFreq=freq.get(a[i]);
        }
        for(int key:freq.keySet())
        {
            if(freq.get(key)==maxFreq) ans=key;
        }
        System.out.println("Maximum frequency is of: "+ans);
    }
}
