//second solution
class Solution
{  
     int count=0;
    public int singlevalued(Node root)
    {
        if(root==null)
        {
            return 0;
        }
       
        solve(root);
        return count;
       
    }
    public boolean solve(Node root)
    {
       if(root==null)
       {
           return true;
       }
      
       boolean left=solve(root.left);
       boolean right=solve(root.right);
       
       if(left&&right)
       {
           if(root.left==null&&root.right==null)
           {
               count++;
               return true;
           }else if(root.left==null&&root.right.data==root.data)
           {
               count++;
               return true;
           }else if(root.right==null&&root.left.data==root.data)
           {
               count++;
               return true;
           }else if((root.left==null&&root.right==null)&&(root.left.data==root.data&&root.right.data==root.data))
           {
               count++;
               return true;
           }
       }
       return false;
    }
    
    
}