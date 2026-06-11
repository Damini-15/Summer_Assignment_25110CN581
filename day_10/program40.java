import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }

            for(char ch='A';ch<='A'+i-1;ch++)
            {
                System.out.print(ch);
            }

            for(char ch=(char)('A'+i-2);ch>='A';ch--)
            {
                System.out.print(ch);
            }

            System.out.println("");
        }
    }
}
