import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        int even=0,odd=0;
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++)
        {
            a[i] = ob.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0) even++;
            else odd++;
        }

        System.out.println("Number of even elements: "+even);
        System.out.println("Number of odd elements: "+odd);

    }
}
