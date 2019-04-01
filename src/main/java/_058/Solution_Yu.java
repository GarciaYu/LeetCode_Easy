package _058;

import java.util.Arrays;

public class Solution_Yu {
    /*
    Approach
    Time Complexity: 99.83%
    Space Complexity: 0.94%
     */
    public int lengthOfLastWord(String s) {
        if (s == null || s.trim().length() == 0) {
            return 0;
        }

        String[] strs = s.split(" ");

        return strs[strs.length - 1].length();
    }
}
