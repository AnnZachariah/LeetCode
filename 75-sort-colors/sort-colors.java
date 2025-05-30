class Solution {
    public void sortColors(int[] nums) {
        int start =0, mid =0, end = nums.length-1;

        while(mid<=end){
            switch(nums[mid]){
                case 0:
                    swap(nums, start, mid);
                    mid++;
                    start++;
                    break;
                
                case 1:
                    mid++;
                    break;

                case 2:
                    swap(nums, mid, end);
                    end--;
                    break;
            }
        }
    }

    private void swap(int[] a, int pos1, int pos2){
        int t = a[pos1];
        a[pos1] = a[pos2];
        a[pos2] = t;
    }
}