import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static List<Integer> intersection (int a[],int b[])
    {
        List <Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:b)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i:a)
        {
            if(map.getOrDefault(i,0)>0)
            {
                list.add(i);
                map.put(i,map.get(i)-1);
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
