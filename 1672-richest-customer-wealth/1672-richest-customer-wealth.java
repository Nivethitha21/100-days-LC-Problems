class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for(int i = 0; i < accounts.length; i++)
        {
            int temp = 0;
            for(int j = 0; j < accounts[0].length; j++)
            {
                temp += accounts[i][j];
            }
            if(temp > wealth)
                wealth = temp;
        }
        return wealth;
    }
}