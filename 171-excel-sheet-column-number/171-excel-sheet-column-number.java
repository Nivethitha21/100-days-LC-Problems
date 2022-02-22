class Solution {
    public int titleToNumber(String columnTitle) {
        int val = 0;
        for(int i = 0;i<columnTitle.length();i++)
        {
            int t = columnTitle.charAt(i)-64;
            val =(val*26)+t;
        }
        return val;
    }
}