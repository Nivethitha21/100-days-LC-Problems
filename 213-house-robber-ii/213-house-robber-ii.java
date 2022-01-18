class Solution {
    public int rob(int[] nums) {
         if(nums.length == 1)
            return nums[0];
        return Math.max(rob1(nums,0,nums.length-1),rob1(nums,1,nums.length));
    }
    public int rob1(int[] nums,int start, int end) {
       
        int prevTwo = 0, prevOne = 0, max = 0;
        for(int i = start; i < end; i++)
        {
            max = Math.max(prevTwo + nums[i],prevOne);
            prevTwo = prevOne;
            prevOne = max;
        }
        return max;
    }
}