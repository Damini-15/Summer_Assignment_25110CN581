import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        String s1 = ob.nextLine();
        String s2 = ob.nextLine();

        if(s1.length()!=s2.length())
        {
            System.out.println("Not Rotation");
            return;
        }

        String temp = s1+s1;

        if(temp.contains(s2))
        {
            System.out.println("Rotation");
        }
        else
        {
            System.out.println("Not Rotation");
        }
    }
}
