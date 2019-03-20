package _026;

public class Solution_Yu {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int nonDuplicateIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int duplicateLen = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    duplicateLen++;
                } else {
                    break;
                }
            }
            if (duplicateLen > 0) {
                nonDuplicateIndex++;
                i = i + duplicateLen;
                nums[nonDuplicateIndex] = nums[i + 1];
            }
        }
        return nonDuplicateIndex + 1;
    }
}
