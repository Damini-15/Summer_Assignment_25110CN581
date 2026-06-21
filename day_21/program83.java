import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();

        int n=s.length();
        char arr[] = s.toCharArray();

        int vowel=0,consonant=0;
        for(int i=0;i<n;i++)
        {
            char ch = arr[i];
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') vowel++;
            else consonant++;
        }


        System.out.println("No. of vowels of string is: "+vowel);
        System.out.println("No. of consonants of string is: "+consonant);
    }
}
