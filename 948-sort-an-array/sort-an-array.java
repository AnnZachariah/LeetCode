class Solution {
    public int[] sortArray(int[] nums) {
        // int i, j;
        // int n=nums.length;
        // for(i=0;i<n-1;i++){
        //     for(j=0;j<n-i-1;j++){
        //         if(nums[j]>nums[j+1]){
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //         }
        //     }
        // }
        // return nums;
        Arrays.sort(nums);
        return nums;
    }
}