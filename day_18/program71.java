import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{

    public static void main (String[] args)
    {
        int index=0;
        boolean flag=false;
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        int a[] = new int [n];

        for(int i=0;i<n;i++)
        {
            a[i] = ob.nextInt();
        }

        System.out.println("Enter element to be searched: ");
        int key = ob.nextInt();

        int mid, l=0,h=n-1;

        while(l<=h)
        {
            mid=l+(h-l)/2;
            if(key==a[mid])
            {
                flag=true;
                index=mid;
                break;
            }
            else if(key<a[mid])
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }

        if(flag) System.out.println("Element found at index: "+(index+1));
        else System.out.println("Element not found");

    }
}
