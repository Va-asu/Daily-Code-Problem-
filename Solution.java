import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer>dq=new LinkedList<>();
        int[] max=new int[nums.length-k+1];
        int i=0,j=0;
        while(j<k)
        {
            while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[j])
            {
               
                dq.pollLast();
            }
            dq.addLast(j);
            j++;
        }
           
            while(j<nums.length)
            {
                max[i]=nums[dq.peekFirst()];
               while(!dq.isEmpty()&&dq.peekFirst()<=j-k)
                {
                    dq.pollFirst();
                }
                 while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[j])
                 {
               
                     dq.pollLast();
                 }
               dq.addLast(j);
                i++;j++;
            }
           max[i]=nums[dq.peekFirst()];
        return max;
    }
    public static void main(String[] args)
    {
       Solution s=new Solution();
       Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       int[] nums=new int[n];
       for(int i=0;i<n;i++)
       {
          nums[i]=scn.nextInt();
       }
       int k=scn.nextInt();
       int[] arr=s.maxSlidingWindow(nums,k);
       for(int i=0;i<arr.length;i++)
       {
          System.out.println(arr[i]);
       }
    }
}