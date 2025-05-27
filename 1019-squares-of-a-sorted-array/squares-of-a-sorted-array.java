class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squared = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            squared[i] = (int)Math.pow(nums[i],2);
        }
        Arrays.sort(squared);
        return squared;
    }
}