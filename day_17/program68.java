import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static List<Integer> intersection (int a[],int b[])
    {
        List <Integer> list = new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j] && !list.contains(a[i])) list.add(a[i]);
            }
        }

        return list;
    }
    public static void main (String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int n1 = ob.nextInt();
        int n2 = ob.nextInt();

        int a[] = new int [n1];
        int b[] = new int [n2];
        for(int i=0;i<n1;i++)
        {
            a[i] = ob.nextInt();
        }
        for(int i=0;i<n2;i++)
        {
            b[i] = ob.nextInt();
        }

        List <Integer> ans = intersection(a,b);

        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }

    }
}
