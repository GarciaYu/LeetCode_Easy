package _026;

import java.util.Arrays;

public class Solution_Yu {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int same = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    same++;
                } else {
                    break;
                }
            }
            if (same != 0) {
                int nextIndex = i + same;
                for (int n = 1; n < nums.length - nextIndex; n++) {
                    nums[i + n] = nums[nextIndex + n];
                }
                i = nextIndex;
                nums = Arrays.copyOf(nums, nums.length - same);
            }
        }

        return nums.length;
    }
}
