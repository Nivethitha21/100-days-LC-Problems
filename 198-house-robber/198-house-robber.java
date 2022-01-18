import java.lang.Math;
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
          int prevTwo = 0, prevOne = 0, max = 0;
        for(int i = 0; i < nums.length; i++)
        {
            max = Math.max(prevTwo + nums[i],prevOne);
            prevTwo = prevOne;
            prevOne = max;
        }
        return max;
    }
}
//2 1 4 3 5 7


    
    