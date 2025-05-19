import java.util.*;
class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = Arrays.binarySearch(nums, target);
        if(result>=0){
            return result;
        }
        else{
            return -result-1;
        }
    }
}