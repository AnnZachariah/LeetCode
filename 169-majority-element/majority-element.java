class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i: nums){
            hash.put(i, hash.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : hash.entrySet()){
            if(entry.getValue()>nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}