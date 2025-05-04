class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();

        for(int i: nums1){
            set1.add(i);
        }

        for(int i: nums2){
            if(set1.contains(i)){
                intersect.add(i);
            }
        }

        //create an array as we have to return array
        int[] result = new int[intersect.size()];
        int count = 0;
        //for each loop to iterate and save into array
        for(int i: intersect){
            result[count++] = i;
        }
        return result;
    }
}