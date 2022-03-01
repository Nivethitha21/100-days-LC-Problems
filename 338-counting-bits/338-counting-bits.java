class Solution {
        public int[] countBits(int n) {
     int[] arr = new int[n+1];
    
        int i=1 ;
        while(i<n+1){
            
        int ele = arr[i/2];
            
        if(i%2==0)
             arr[i]= ele ;
         else
            arr[i]= ele + 1;
           
            i++;
        }
     
        return arr;
      
}
}