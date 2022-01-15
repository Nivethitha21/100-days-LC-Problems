class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
            sum += nums[i];
        if(sum % 2 != 0)
            return false;
        sum = sum/2;
        boolean[][] memo = new boolean[nums.length+1][sum+1];
        for(int i = 1; i <= sum; i++)
            memo[0][i] = false;
        for(int i = 0; i <= nums.length; i++)
            memo[i][0] = true;
        for(int i = 1; i <= nums.length; i++)
        {
            for(int j = 1; j <= sum; j++)
            {
                if(j < nums[i-1])
                    memo[i][j] = memo[i-1][j];
                else
                    memo[i][j] = memo[i-1][j] || memo[i-1][j-nums[i-1]];
            }
        }
        return memo[nums.length][sum];
    }
}