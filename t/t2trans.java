package t;

import java.util.HashSet;

public class t2trans {
    public int containduplicate(int nums[]){
        if(nums==null||nums.length<=1){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num:nums){
            if (set.contains(num)) {

                set2.add(num);
            }
            else{
                set.add(num);
            }
        }
        return set2.size();
    }
}
