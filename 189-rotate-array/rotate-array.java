class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length; // for rotations if k is greater than length of array
        rotate_array(nums, 0, nums.length-1);
        rotate_array(nums, 0, k-1);
        rotate_array(nums, k, nums.length-1);
    }

    public static void rotate_array(int[] nums, int start, int end){
        while(start<end){
            int t = nums[start];
            nums[start] = nums[end];
            nums[end] = t;
            start++;
            end--;
        }
    }
}