import java.util.*;
class Main {
    ArrayList<String> IDS =new ArrayList<>();
    public void record(String order_id)
    {
        IDS.add(order_id);
        System.out.println(IDS);
    }
    public String get_last(int i)
    {
       return IDS.get(IDS.size()-1-i);
    }
    public static void main(String[] args)
    {
       Main sol=new Main();
       Scanner scn=new Scanner(System.in);
       int flag=0;
       while(flag==0)
       {
          int n=scn.nextInt();
          switch(n)
          {
            case 1:
              System.out.println("enter id");
              String str=scn.next();
              sol.record(str);
              break;
            case 2:
              System.out.println("enter last position");
              int i=scn.nextInt();
              System.out.println("the last "+i+"th ID is: "+sol.get_last(i));
              break;
              
          }
          if(flag==0)
          {
            System.out.println("want to end switch value of flag to 1");
            flag=scn.nextInt();
          }
          if(flag==0)
          {
              System.out.pritln("you choose to continue");
          }else{
              System.out.println("terminating session "+IDS);
          }
       }
    }
}