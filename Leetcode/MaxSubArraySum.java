package Leetcode;

public class MaxSubArraySum {
    static void main() {

        int[] arr = { 1, 2, 3, 4 };
        //System.out.println(maxSubArray(arr));
        int[] arr2 = { -1, 2, 2, -3, 1, 8, 6 };
        System.out.println(maxSubArray(arr2));
        //System.out.println(maxSubArray2(arr2));

    }

    // return maxSubArray only for positive numbers
    static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int maxSum = Integer.MIN_VALUE;
        int curSum = Integer.MIN_VALUE;
        for (int num : nums) {
            curSum = Math.max(curSum + num, num);
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }

    // if max sum is in nagative then return zero or -1 based on requirement
    // logic cover negative value as well in array
    static int maxSubArray2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int num : nums) {
            curSum = curSum + num;
            if(curSum < 0)
                curSum = 0;
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }
}
