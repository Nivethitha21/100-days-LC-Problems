class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<Integer>();
        prev.add(1);
        if(rowIndex == 0)
            return prev;
        for(int i = 0; i <= rowIndex; i++)
        {
            List<Integer> ans = new ArrayList<Integer>();
            ans.add(1);
            for(int j = 0; j < i-1; j++)
            {
                ans.add(prev.get(j) + prev.get(j+1));
            }
            ans.add(1);
            prev = ans;
        }
        return prev;
        
    }
}