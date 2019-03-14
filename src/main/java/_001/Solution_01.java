package _001;

import java.util.HashMap;
import java.util.Map;

public class Solution_01 {
    /*
    Approach: One-pass Hash Table(The Recommended Approach)
    Time Complexity: 99.8%
    Space Complexity: 25%
     */
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] { i, map.get(diff) };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No Solution");
    }
}
