

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
    public void solve(Node root)
    {
       if(root==null)
       {
           return;
       }
       if(isUnivalued(root))
       {
           count++;
       }
       solve(root.left);
       solve(root.right);
    }
    
    public boolean isUnivalued(Node root)
    {
        int val=root.data;
        Stack<Node>st=new Stack<>();
        st.push(root);
        while(st.size()!=0)
        {
            Node node=st.pop();
            if(node.data!=val)
            {
                return false;
            }
            if(node.left!=null)
            {
                st.push(node.left);
            }
            if(node.right!=null)
            {
                st.push(node.right);
            }
        }
        return true;
    }
}


