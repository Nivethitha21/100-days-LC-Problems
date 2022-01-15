class Solution {
    public int countOdds(int low, int high) {
        if(low == high)
        {
            if(low%2 != 0)
                return 1;
            return 0;
        }
        int count = 0;
        if(low%2 == 0 && high%2 == 0)
            count = 1 + ((high - low - 1)/2);
        else if((low%2 != 0 && high%2 == 0) || (low%2 == 0 && high%2 != 0))
            count = 1 + ((high - low)/2);
        else
            count = 2 + ((high - low - 1)/2);
    return count;
    }
    
}
// 3 9
// 3 10
// 4 5 6 7 8 9 - 3
// 4 10
// 5 6 7 8 9 - 

    