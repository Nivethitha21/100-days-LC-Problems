class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int time = duration;
        for(int i = 0; i < timeSeries.length-1; i++)
        {
            if(timeSeries[i+1] - timeSeries[i] > duration)
                time += duration;
            else
                time += timeSeries[i+1] - timeSeries[i];
        }
   return time;
    }
    
}
			   
    