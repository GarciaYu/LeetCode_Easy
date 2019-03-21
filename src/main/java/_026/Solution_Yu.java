package _026;

public class Solution_Yu {
    /*
    Approach
    Time Complexity: 99.8%
    Space Complexity: 76%
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int nonDuplicateIndex = 0;
        int i = 0;
        while (i < nums.length) {
            nums[nonDuplicateIndex] = nums[i];
            nonDuplicateIndex++;

            int duplicateLen = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    duplicateLen++;
                } else {
                    break;
                }
            }

            if (duplicateLen > 0) {
                i += duplicateLen + 1;
            } else {
                i++;
            }
        }
        return nonDuplicateIndex;
    }
}
