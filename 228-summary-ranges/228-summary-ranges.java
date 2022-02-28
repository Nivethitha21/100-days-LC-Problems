class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
    
    int i = 0;
    
    while(i < nums.length){
        StringBuilder sb = new StringBuilder(""+nums[i]);
        int j = i + 1;
        while(j < nums.length && nums[j] == nums[j - 1] + 1){
            j++;
        }
        if(j != i + 1){
            sb.append("->"+nums[j-1]);
        }
        
        result.add(sb.toString());
        i = j;
    }
    return result;
    }
}