class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int longestStreak = 0;
        for(int i: set){
            if(!set.contains(i-1)){
                int current = i;
                int currentStreak = 1;

                while(set.contains(current+1)){
                    current++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}