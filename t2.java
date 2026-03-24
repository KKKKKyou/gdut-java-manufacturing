package t;

import java.util.HashMap;

public class t2 {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] result = twosum(nums,9);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

public static int[] twosum(int[] nums, int target){
            HashMap<Integer,Integer>map=new HashMap<>();
            for (int i=0;i<nums.length;i++){
                int complement=target-nums[i];
                if (map.containsKey(complement)) {
                    return new int[]{map.get(complement),i};
                }
                map.put(nums[i],i);
            }
                    return new int[]{};
        }
    }
