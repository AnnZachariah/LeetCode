class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double current = 0;
        for(int i =0;i<k;i++){
            current = current+nums[i];
            sum = current;
        }
        for(int i = 1; i<= nums.length-k;i++){
            current = current - nums[i-1] + nums[i+k-1];
            if(current > sum){
                sum = current;
            }
        }
        return sum/k;
    }
}