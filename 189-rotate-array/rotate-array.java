class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        rotate_array(nums,0,nums.length-1);
        rotate_array(nums,0,k-1);
        rotate_array(nums,k,nums.length-1);
    }

    public static void rotate_array(int[] a, int low, int high){
        while(low<=high){
            int t = a[low];
            a[low] = a[high];
            a[high] = t;
            low++;
            high--;
        }
    }
}