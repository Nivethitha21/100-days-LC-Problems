class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        int sum = 0;
        for(int i = n-1; i >= 0; i--){
            sum += grid[m-1][i];
            dp[m-1][i] = sum;
            // System.out.println(dp[m-1][i]);
        }
    
        for(int i = m-2; i >= 0; i--)
        {
            // System.out.println("Hi");
            for(int j = n-1; j >= 0; j--)
            {
                if(j == n-1)
                    dp[i][j] = grid[i][j] + dp[i+1][j];
                else
                    dp[i][j] = grid[i][j] + Math.min(dp[i+1][j],dp[i][j+1]);
                // System.out.println(dp[i][j]);
            }
        }
        return dp[0][0];
    }
}

// 4 5 6
 
//     12   11  9
//     15 11  6
