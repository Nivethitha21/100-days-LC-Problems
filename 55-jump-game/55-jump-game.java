class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1)
            return true;
        boolean[] dp = new boolean[nums.length];
        for(int i = nums.length-2; i >= 0; i--)
        {
            if(nums[i] + i >= nums.length-1){
                dp[i] = true;continue;}
            for(int j = 1;j <= nums[i];j++)
            {
                if(dp[j+i] == true){
                    dp[i] = true;
                    break;
                }
            }
            if(dp[i] == true)
                continue;
                dp[i] = false;
        } 
        return dp[0];
    }
}

        