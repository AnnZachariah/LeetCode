class Solution {
    public int thirdMax(int[] nums) {
        // TreeSet<Integer> set = new TreeSet<>();

        // for(int i : nums){
        //     set.add(i);
        //     if(set.size()>3){
        //         set.remove(set.first());
        //     }
        // }
        // if(set.size() == 3){
        //     return set.first();
        // }
        // if(set.size() < 3){
        //     return set.last();
        // }
        // return set.last();

        Long first = Long.MIN_VALUE;
        Long second = Long.MIN_VALUE;
        Long third = Long.MIN_VALUE;

        for(int i: nums){
            if(i==first || i==second || i==third){
                continue;
            }

            if(i>first){
                third = second;
                second = first;
                first = (long)i;
            }
            else if(i>second){
                third = second;
                second = (long)i;
            }
            else if(i>third){
                third = (long)i;
            }
        }

        return third == Long.MIN_VALUE ? first.intValue() : third.intValue();

    }
}