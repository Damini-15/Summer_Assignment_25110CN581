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
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                a[index++]=a[i];
            }
        }
        while(index<n)
        {
            a[index++]=0;

        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
