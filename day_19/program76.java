import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{

    public static void main (String[] args)
    {
        int left=0,right=0;
        Scanner ob = new Scanner(System.in);
        int r=ob.nextInt();
        int c=ob.nextInt();

        int a[][] = new int [r][c];

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
                if(i==j) left+=a[i][j];
            }
        }

        int j=c-1;
        for(int i=0;i<r;i++)
        {
            right+=a[i][j];
            j--;
        }

        System.out.println("Sum of left and right diagonals are: "+left+" "+right);
    }
}
