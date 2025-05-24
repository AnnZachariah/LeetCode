import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> duplicate = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            duplicate.put(nums[i], duplicate.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : duplicate.entrySet()){
            if(entry.getValue()>=2){
                return true;
            }
        }
        return false;
    }
}