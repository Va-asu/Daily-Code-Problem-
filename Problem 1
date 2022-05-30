import java.util.*;

public class Main {
    public static boolean solve(List<Integer>list,int k)
    {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<list.size();i++)
        {
           if(set.contains(k-list.get(i)))
           {
             return true;
           }
           set.add(list.get(i));
        }
        return false;
    }
    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       List<Integer>list=new ArrayList<>();
       int n=scn.nextInt();
       for(int i=0;i<n;i++)
       {
         list.add(scn.nextInt());
       }
       int k=scn.nextInt();
       System.out.println(solve(list,k));
    }
}
