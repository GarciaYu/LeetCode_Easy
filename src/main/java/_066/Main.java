package _066;

import java.util.Arrays;

/**
 * Plus One
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each
 * element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * <p>
 * Example 2:
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */
public class Main {
    public static void main(String[] args) {
        Solution_Yu solution = new Solution_Yu();
        int[] digits = {9,9};
        System.out.println(Arrays.toString(solution.plusOne(digits)));
    }
}
