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
                if(j-1 >= 0 && j+1 < n)
                {
                    dp[i][j] = matrix[i][j]+Math.min(Math.min(dp[i+1][j-1],dp[i+1][j]),dp[i+1][j+1]);
                }
                else if(j-1 >= 0)
                    dp[i][j] = matrix[i][j] + Math.min(dp[i+1][j-1],dp[i+1][j]);
                else if(j+1 < n)
                     dp[i][j] = matrix[i][j] + Math.min(dp[i+1][j+1],dp[i+1][j]);
                else
                    dp[i][j] = matrix[i][j] + dp[i+1][j];
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

