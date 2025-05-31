class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    //     int i =0,j=0,k=0;
    //     int[] result = new int[m+n];
    //     while(i<m && j<n){
    //         if(nums1[i]<nums2[j]){
    //             result[k++] = nums1[i++];
    //         }
    //         else{
    //             result[k++] = nums2[j++];
    //         }
    //     }

    //     while(i<m){
    //         result[k++] = nums1[i++];
    //     }

    //     while(j<n){
    //         result[k++] = nums2[j++];
    //     }

    //     for(i=0;i<result.length;i++){
    //         nums1[i] = result[i];
    //     }
    // }

    // inplace using three pointers
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--] = nums2[j--];
        }
    }
}