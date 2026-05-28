import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int fact(int n)
    {
        if(n==1 || n==0) return 1;
        return n*fact(n-1);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner ob = new Scanner(System.in);
		int n=ob.nextInt();
		int factorial = fact(n);
		System.out.println("Factorial is: "+factorial);
	}
}
