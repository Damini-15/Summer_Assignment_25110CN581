import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        boolean flag=false;
        int index=0;
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++)
        {
            a[i] = ob.nextInt();
        }
        System.out.println("Enter element to be searched:");
        int key=ob.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                flag=true;
                index=i;
                break;
            }
        }

        if(flag)
        {
            System.out.println("Element found at index:"+(index+1));
        }
        else
        {
            System.out.println("Element not found");
        }

    }
}
