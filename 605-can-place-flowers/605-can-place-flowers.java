class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++)
        {
            if(flowerbed[i] == 1)
                continue;
            else if(i != 0 && flowerbed[i-1] == 1)
                continue;
            else if(i != flowerbed.length-1 && flowerbed[i+1] == 1)
                continue;
            // if(i == 0 && flowerbed[i+1] == 1)
            //     continue;
            flowerbed[i] = 1;
            count++;
        }
        if(count < n)
            return false;
        return true;
}
}
