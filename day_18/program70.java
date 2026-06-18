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

        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[min]) min=j;
            }

            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
