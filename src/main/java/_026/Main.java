package _026;

import java.util.Arrays;

/**
 * Remove Duplicates from Sorted Array
 * Given a sorted array nums, remove the duplicates in-place such that each element
 * appear only once and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the
 * input array in-place with O(1) extra memory.
 * <p>
 * Clarification:
 * Confused why the returned value is an integer but your answer is an array?
 * <p>
 * Note that the input array is passed in by reference, which means modification to
 * the input array will be known to the caller as well.
 * <p>
 * Internally you can think of this:
 * // nums is passed in by reference.
 * int len = removeDuplicates(nums);
 * <p>
 * // any modification to nums in your function would be know by the caller.
 * // using the length returned by your function, it prints the first len elements.
 * for(int i = 0; i < len; i++){
 * print(nums[i]);
 * }
 */


public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Solution_Yu solution = new Solution_Yu();
        int length = solution.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(length);
    }
}
