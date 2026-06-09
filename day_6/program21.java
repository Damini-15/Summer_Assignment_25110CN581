import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int binary[] = new int [32];int i=0;
        Scanner ob = new Scanner(System.in);
        int decimal = ob.nextInt();

        while(decimal>0)
        {
            binary[i++] = decimal%2;
            decimal/=2;
        }

        for(int j=i-1;j>=0;j--)
        {
            System.out.print(binary[j]);
        }
    }
}
