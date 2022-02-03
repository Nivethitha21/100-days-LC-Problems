class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
       HashMap<Integer,Integer> map=new HashMap<>();

    for(int c: nums4){ 
        for(int d: nums3){   
            map.put(c+d,map.getOrDefault(c+d,0)+1);  
        }
    }
    
    int count=0;   
    for(int a: nums1){
        for(int b: nums2){
            count+= map.getOrDefault(-(a+b),0);              
        }
    }
    return count;
}
}