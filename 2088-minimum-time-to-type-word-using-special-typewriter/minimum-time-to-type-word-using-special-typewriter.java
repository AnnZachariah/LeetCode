class Solution {
    public int minTimeToType(String word) {
        int time = 0;
        char current = 'a';

        for(int i =0;i<word.length();i++){
            char target = word.charAt(i);
            int diff = Math.abs(target - current);
            int min = Math.min(diff, 26-diff); //countter and clockwise
            time = min+time;
            time += 1;
            current = target;
        }
        return time;
    }
}