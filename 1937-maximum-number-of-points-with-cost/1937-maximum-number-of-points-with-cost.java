class Solution {
    public long maxPoints(int[][] points) {
        int rows= points.length, cols=points[0].length;
        Long [][] dp = new Long[rows][cols];
        for(int i=0;i<cols;i++) {
            dp[0][i] = Long.valueOf(points[0][i]);
        }
        
        Long [] left = new Long[cols];
        Long [] right = new Long[cols];
        for(int i=1;i<rows;i++) {
            left[0] = dp[i-1][0];
            right[cols-1] = dp[i-1][cols-1];
            //fill left
            for(int k=1;k<cols;k++) {
                left[k] = Math.max(left[k-1]-1,dp[i-1][k]);
            }
            //fill right
            for(int k=cols-2;k>=0;k--) {
                right[k] = Math.max(right[k+1]-1,dp[i-1][k]);
            }
            //fill dp
            for(int k=0;k<cols;k++) {
                dp[i][k] = Math.max(left[k], right[k])+points[i][k];
            }  
        }
        // result is the max of last row
        Long maxPoints = Long.valueOf(-1);
        for(int i=0;i<cols;i++) {
            maxPoints = Math.max(maxPoints, dp[rows-1][i]);
        }        
        return maxPoints;
    }
}