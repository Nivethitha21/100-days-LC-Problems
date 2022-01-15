class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> memo = new ArrayList<List<Integer>>();
         List<Integer> l = new ArrayList<Integer>();
            l.add(1);
        memo.add(l);
        for(int i = 1; i < numRows; i++)
        {
            List<Integer> li = new ArrayList<Integer>();
            li.add(1);
            for(int j = 0; j < i-1; j++)
            {
                li.add(memo.get(i-1).get(j) + memo.get(i-1).get(j+1));
            }
            li.add(1);
            memo.add(li);
        }
        return memo;
    }
}