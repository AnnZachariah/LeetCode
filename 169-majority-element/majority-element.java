class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> majority = new HashMap<>();
        for(int i =0;i<nums.length; i++){
            // if(majority.containsKey(nums[i])){
            //     majority.put(nums[i], majority.get(nums[i])+1);
            // }
            // else{
            //     majority.put(nums[i], 1);
            // }
            majority.put(nums[i], majority.getOrDefault(nums[i],0)+ 1);
        }

        for(Map.Entry<Integer, Integer> entry: majority.entrySet()){
            if(entry.getValue()>nums.length/2){
                return entry.getKey();
            }
        }
    return -1;
    }
}