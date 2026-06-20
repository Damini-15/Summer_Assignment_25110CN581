import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int r = ob.nextInt();
        int c = ob.nextInt();
        int[][] matrix = new int[r][c];

        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                matrix[i][j] = ob.nextInt();
            }
        }

        int i=0;
        while(i<r)
        {
            int sumr=0;
            for(int j=0;j<c;j++)
            {
                sumr+=matrix[i][j];
            }
            i++;
            System.out.println("Sum of row "+i+ " is "+sumr);
        }

    }
}
