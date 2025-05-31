class Solution {
    public int[] sortedSquares(int[] nums) {
        // for(int i = 0;i<nums.length;i++){
        //     nums[i] = nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

        // more efficient
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int pos;

        for(int i =0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }

        for(pos=nums.length-1;pos>=0;pos--){
            if(nums[left]<nums[right]){
                result[pos] = nums[right];
                right--;
            }
            else{
                result[pos] = nums[left];
                left++;
            }
        }
        return result;
    }
}