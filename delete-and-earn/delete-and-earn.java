class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int[] dp = new int[10005];
         int[] freq = new int[20005];
        for(int i : nums)
        {
            freq[i]++;
        }
        dp[1] = freq[1];
        dp[2] = Math.max(freq[2]*2,freq[1]);
        for(int i = 3; i <= max; i++)
        {
            dp[i] = Math.max(dp[i-1],dp[i-2] + freq[i] * i);
        }
        return dp[max];
    }
}
// 3 4 2

//     2 2 3 3 3 4 
    
     