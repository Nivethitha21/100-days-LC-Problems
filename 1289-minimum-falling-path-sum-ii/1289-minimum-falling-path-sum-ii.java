class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            dp[n-1][i] = matrix[n-1][i];
        }
        for(int i = n-2; i >= 0; i--)
        {
            for(int j = 0; j < n; j++)
            {
                int min = Integer.MAX_VALUE;
                for(int k = 0; k < n; k++)
                {
                    if(j == k)
                        continue;
                    min = Math.min(min,dp[i+1][k]);
                }
                dp[i][j] = min + matrix[i][j];
            }
        }
        int min = Integer.MAX_VALUE; 
        for(int i = 0; i < n; i++)
        {
            if(dp[0][i] < min)
                min = dp[0][i];
        }
        return min;
    }
}

