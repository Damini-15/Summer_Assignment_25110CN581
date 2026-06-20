import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{

    public static void main (String[] args)
    {

        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();

        int a[][] = new int [n][n];
        int b[][] = new int [n][n];
        int c[][] = new int [n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = ob.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j] = ob.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int x=0;
                for(int k=0;k<n;k++)
                {
                    x+=a[i][k]*b[k][j];
                }

                System.out.print(x+" ");
            }
            System.out.println("");
        }

    }
}
