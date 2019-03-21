package _026;

public class Solution_01 {
    /*
    Approach: Two Pointers

    Algorithm
    Since the array is already sorted, we can keep two pointers i and j, where i is the slow-runner
    while j is the fast-runner. As long as nums[i] = nums[j], we increment j to skip the duplicate.

    When we encounter nums[i] != nums[j], the duplicate run has ended so we must copy its value to
    nums[i+1]. i is then incremented and we repeat the same process again until j reaches the end of array.

    Complexity Analysis
    (1) Time Complexity: O(n). Assume that n is the length of array. Each of i and j traverses at most n steps.
    (2) Space Complexity: O(1).

    Time Complexity: 99.9%
    Space Complexity: 86%
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
