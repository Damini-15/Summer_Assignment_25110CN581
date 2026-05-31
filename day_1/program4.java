import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int count=0;
		Scanner ob = new Scanner(System.in);
		int n=ob.nextInt();
		while(n>0)
		{
		    count++;
		    n/=10;
		}
		System.out.println("Number of digits are: "+count);
	}
}
