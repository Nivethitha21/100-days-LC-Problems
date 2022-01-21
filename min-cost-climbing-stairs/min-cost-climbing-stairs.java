import java.lang.Math;
class Solution {
  
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] M = new int[n+1];
        
        
        //Base case:
        M[0] = 0;
        M[1] = 0;
        
        
        //Recursion
        for(int i = 2;i< n+1; i++){
            M[i] = Math.min(M[i-2] + cost[i-2], M[i-1] + cost[i-1]);
        }
        

        return M[n];
    }
}



