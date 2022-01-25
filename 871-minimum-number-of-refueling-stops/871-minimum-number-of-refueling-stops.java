class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        
        int[] dp = new int[stations.length + 1];
        dp[0] = startFuel;
        
        for (int i = 0; i < stations.length; i++) {
            for (int stops = i + 1; stops > 0; stops--) {
                if (dp[stops - 1] >= stations[i][0]) {
                    dp[stops] = Math.max (dp[stops], dp[stops - 1] + stations[i][1]);
                }
            }
        }
        
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] >= target) {
                return i;
            }
        }
        
        return -1;
    }
}


// 10 - - - -