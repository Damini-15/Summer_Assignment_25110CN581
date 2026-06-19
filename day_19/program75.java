import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{

    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int r=ob.nextInt();
        int c=ob.nextInt();

        int a[][] = new int [r][c];
        int b[][] = new int [r][c];
        int ans[][] = new int [r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j] = ob.nextInt();
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println("");
        }

    }
}
