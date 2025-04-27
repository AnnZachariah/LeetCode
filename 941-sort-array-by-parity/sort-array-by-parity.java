class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]%2!=0){
                    int t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                }
            }
        }
        return nums;
    }
}