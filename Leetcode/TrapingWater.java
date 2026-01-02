package Leetcode;

import java.util.Arrays;

public class TrapingWater {
    static void main() {
        int []buildings = {4,3,2,6,5,7,4,2,1};
        System.out.println(trap(buildings));
    }
    static int trap(int[] height) {
        int [] left = new int[height.length];
        int [] right = new int[height.length];
        left[0] = height[0];
        int water = 0;
        for(int i = 1; i < height.length; i++){
            left[i] = Math.max(left[i-1], height[i]);
        }
        right[height.length-1] = height[height.length-1];
        for(int j = height.length - 2; j >= 0; j--){
            right[j] = Math.max(right[j + 1], height[j]);
        }
        for(int i = 0; i < height.length; i++){
            water += Math.min(left[i],right[i]) - height[i];
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        return water;
    }
}
