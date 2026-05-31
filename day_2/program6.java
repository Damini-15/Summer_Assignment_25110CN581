import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int rev=0,digit=0;
	    Scanner ob = new Scanner(System.in);
	    int n = ob.nextInt();

	    while(n>0)
	    {
	        digit=n%10;
	        rev=rev*10+digit;
	        n/=10;
	    }

	    System.out.println("Reverse is:"+rev);

	}
}
