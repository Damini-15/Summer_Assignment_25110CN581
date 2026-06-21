import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static String reverse(String s)
    {
        int n=s.length();
        char arr[] = s.toCharArray();
        for(int i=0;i<n/2;i++)
        {
            char temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        return new String(arr);
    }

    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        String str = ob.nextLine();

        String rev = reverse(str);

        System.out.println("Reverse of string is: "+rev);
    }
}
