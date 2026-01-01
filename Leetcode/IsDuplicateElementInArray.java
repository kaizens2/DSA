package Leetcode;

import java.util.*;

public class IsDuplicateElementInArray {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9,1};
        System.out.println(isDuplicate(arr));
        System.out.println(isDuplicate2(arr));
    }

    public static boolean isDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                return true;
            }
            map.put(num, 1);
        }
        return false;
    }

    // faster than MAP
    public static boolean isDuplicate2(int[] nums) {
       Set<Integer> set = new HashSet<>();
       for(int num : nums){
           if(!set.add(num)){
               return true;
           }
       }
        return false;
    }
}
