class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;   // We take two pointers left and right
        int right = n-1;
        int current_capacity = 0; // We keep on calculating capacity after each pointer movement
        int maximum_capacity = 0; // This is to store the maximum_capacity
        while(left < right) 
        {
            current_capacity = (right-left)*Math.min(height[left],height[right]);
            if(current_capacity > maximum_capacity)maximum_capacity = current_capacity;
            if(height[left]<height[right])++left;
            else --right;
        }
        return maximum_capacity;
    }
}