class Solution {
    public int maxDistToClosest(int[] seats) {
        int[] dist = new int[seats.length];
        int max = -1;
        for(int i = 0; i < seats.length; i++)
        {
            if(seats[i] == 1)
                dist[i] = 0;
            else
            {
                int j = i;
                int leftDist,rightDist = 0;
                while(i >= 0 && seats[i] != 1)
                    i--;
                if(i == -1)
                    leftDist = Integer.MAX_VALUE;
                else
                    leftDist = j - i;
                i = j;
                while(i < seats.length && seats[i] != 1)
                    i++;
                if(i == seats.length)
                    rightDist = Integer.MAX_VALUE;
                else
                    rightDist = i - j;
                i = j;
                dist[i] = rightDist <= leftDist? rightDist:leftDist;
                
            }
            if(dist[i] > max)
                max = dist[i];
            // System.out.println(dist[i]);
        }
        return max;
    }
}
// 1

// 1 0 0 0 1 0 1
// 0 1 2 1 0 1 0

// 0 1 
// 1 0 0 0
// 0 1 2 3

