import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n1 = ob.nextInt();
        int a1 [] = new int [n1];

        for(int i=0;i<n1;i++)
        {
            a1[i] = ob.nextInt();
        }

        int n2 = ob.nextInt();
        int a2 [] = new int [n2];

        for(int i=0;i<n2;i++)
        {
            a2[i] = ob.nextInt();
        }

        int res [] = new int [n1+n2];

        int i=0,j=0,k=0;
        while(i<n1 && j<n2)
        {
            if(a1[i]<=a2[j])
            {
                res[k++] = a1[i++];
            }

            else
            {
                res[k++] = a2[j++];
            }
        }

        System.out.println("Merged array:");
        for (int x : res)
        {
            System.out.print(x + " ");
        }
    }
}
