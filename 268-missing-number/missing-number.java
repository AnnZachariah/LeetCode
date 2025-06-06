class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int sum = (n*(n+1))/2;
        // for(int i = 0; i<nums.length;i++){
        //     sum = sum - nums[i];
        // }
        // return sum;

        // using XOR
        int xor = 0;
        for(int i =0;i<=nums.length;i++){
            xor = xor^i;
        }

        for(int i: nums){
            xor = xor^i;
        }
        return xor;
    }
}