class Solution {
    public int addDigits(int num) {
        int n = num;
        int sum = 0;
        while(num > 0)
        {
            int rem = num % 10;
            sum += rem;
            num = num/10;
        }
        while(sum > 9)
        {
            num = sum;
            sum = 0;
            while(num > 0)
        {
            int rem = num % 10;
            sum += rem;
            num = num/10;
        }
        }
        return sum;
    }
}