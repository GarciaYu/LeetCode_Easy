package _026;

import java.util.*;

public class Solution_Yu {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        /*
        Declare a map to record start-position & length of duplicates
        Map<startPosition, length>
         */
        Map<Integer, Integer> duplicatesMap = new HashMap<>();
        /*
        Find out duplicates
         */
        for (int i = 0; i < nums.length - 1; i++) {
            int same = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    same++;
                }
            }
            if (same > 0) {
                duplicatesMap.put(i, same);
            }
        }
        /*
        Remove duplicates
         */
        Set<Integer> keySet = duplicatesMap.keySet();
        Iterator<Integer> keyIterator = keySet.iterator();
        int removeLen = 0;
        while (keyIterator.hasNext()) {
            Integer startPos = keyIterator.next();
            Integer length = duplicatesMap.get(startPos);
            int destPos = startPos + length;
            for (int offset = 1; offset < nums.length - destPos; offset++) {
                nums[startPos + offset - removeLen] = nums[destPos + offset - removeLen];
            }
            removeLen += length;
        }
        nums = Arrays.copyOf(nums, nums.length - removeLen);

        return nums.length;
    }
}
