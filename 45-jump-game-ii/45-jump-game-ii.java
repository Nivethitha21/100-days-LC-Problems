class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1)
            return 0;
        int[] dp = new int[nums.length];
        dp[nums.length-1] = 0;
        for(int i = nums.length-2; i >= 0; i--)
        {
            if(nums[i] + i >= nums.length-1)
                dp[i] = 1;
            else
            {
                int j = 1;
                int min = Integer.MAX_VALUE;
                int ind = -1;
                while(j <= nums[i])
                {
                    if(dp[j + i] == -1)
                    {
                        j++;
                        continue;
                    }
                    if(dp[j+i]+nums[i] < min){
                        min = dp[j+i] + nums[i];
                        ind = j + i;    
                    }
                    j++;
                }
                if(ind != -1)
                    dp[i] = dp[ind] + 1;  
                else
                    dp[i] = -1;
            }
        }
        return dp[0];
    }
}

// 2 3 1 1 4
 
//  2  1  2  1  0