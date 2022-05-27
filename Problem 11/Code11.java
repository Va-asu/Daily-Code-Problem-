import java.util.*;

public class Main {
    public static ArrayList solve(String[] arr,String st)
    {
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
          int j=0;
          for(j=0;j<st.length();j++)
          {
              
              if(st.charAt(j)!=arr[i].charAt(j))
              {
                break;
              }
          }
          if(j==st.length())
          {
            list.add(arr[i]);
          }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=scn.next();
        }
        String st=scn.next();
        System.out.println(solve(arr,st));
    }
}