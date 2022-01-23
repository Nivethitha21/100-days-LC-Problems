class Solution {            // O(n); O(1)
    public int maxSubArray(int[] nums) {
        int dp = nums[0];
        int globalMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp < 0) {
                dp = nums[i];
            } else {
                dp += nums[i];
            }
            globalMax = Math.max(globalMax, dp);
        }
        return globalMax;
    }
}

