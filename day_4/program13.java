import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int a=0,b=1,next;
        for(int i=0;i<n;i++)
        {
            if(i<=1)
            {
                System.out.print(i+" ");
            }
            else
            {
                next=a+b;
                a=b;
                b=next;
                System.out.print(next+" ");
            }
        }

    }
}
