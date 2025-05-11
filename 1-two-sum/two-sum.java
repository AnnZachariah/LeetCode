class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapset = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int comp = target - nums[i];

            if(mapset.containsKey(comp)){
                return new int[] {mapset.get(comp), i};
            }
            mapset.put(nums[i],i);
        }
        return new int[] {};
    }
}