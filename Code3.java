class Solution {
    public int numberOfBeams(String[] bank) {
        int n=bank.length;
        int sum=0,prev=0,next=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<bank[i].length();j++)
            {
                if(bank[i].charAt(j)=='1')
                {
                    count++;
                }
            }
            if(next!=0)
            {
                prev=next;
            }
            next=count;
            if(next!=0&&prev!=0)
            {
                sum+=next*prev;
                prev=next;
                next=0;
            }
            
        }
        return sum;
    }
}
