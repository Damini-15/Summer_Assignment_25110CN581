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

        int j=0;
        while(j<r)
        {
            int sumc=0;
            for(int i=0;i<r;i++)
            {
                sumc+=matrix[i][j];
            }
            j++;
            System.out.println("Sum of column "+j+ " is "+sumc);
        }

    }
}
