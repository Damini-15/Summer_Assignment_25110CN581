import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean isSymmetric(int[][] matrix, int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (matrix[i][j] != matrix[j][i])
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix[i][j] = ob.nextInt();
            }
        }

        if (isSymmetric(matrix, n))  System.out.println("Matrix is Symmetric.");
        else System.out.println("Matrix is Not Symmetric.");

    }
}
