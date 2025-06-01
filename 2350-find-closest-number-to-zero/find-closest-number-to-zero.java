class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(Math.abs(nums[i])<Math.abs(min)){
                min = nums[i];
            }
            else if(Math.abs(nums[i])==Math.abs(min)){
                min = Math.max(nums[i], min);
            }
        }
        return min;
    }
}