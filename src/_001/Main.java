package _001;

/**
 * Two Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class Main {
    public static void main(String[] args) {
        Solution_01 solution = new Solution_01();
        int[] nums = { 3, 6, 3, 4 };
        int target = 6;
        int[] indices = solution.twoSum(nums, target);
        System.out.println(indices[0] + " , " + indices[1]);
    }
}
