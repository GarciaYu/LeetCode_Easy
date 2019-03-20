package _026;

import java.util.*;

public class Solution_Yu_Temp {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int sameLen = 0;
            /*
            Find out duplicates
            */
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    sameLen++;
                } else {
                    break;
                }
            }
            /*
            Remove duplicates
             */
            if (sameLen > 0) {
                int startPos = i + 1;
                int copyLen = nums.length - sameLen - startPos;
                System.arraycopy(nums, startPos + sameLen, nums, startPos, copyLen);
                nums = Arrays.copyOf(nums, nums.length - sameLen);
            }
        }
        return nums.length;
    }
}
