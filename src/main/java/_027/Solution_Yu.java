package _027;

public class Solution_Yu {
    /*
    Approach
    Time Complexity: 100%
    Space Complexity: 53%
     */
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = -1;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
