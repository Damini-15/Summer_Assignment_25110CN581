import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);

        for(int i=65;i<=69;i++)
        {
            for(int j=65;j<=i;j++)
            {
                System.out.print((char)j);
            }
            System.out.println("");
        }
    }
}
