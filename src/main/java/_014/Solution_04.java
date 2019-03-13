package _014;

public class Solution_04 {
    /*
    Approach: Binary Search
    The idea is to apply binary search method to find the string with maximum value L, which is common prefix of all the strings.
    The algorithm searches spaces is the interval (0...minLen), where minLen is minimum string length and the maximum possible
    common prefix. Each time search space is divided in two equal parts, one of them is discarded, because it is sure that it
    doesn't contain the solution. There are two possible cases:
        (1) S[1...mid] is not a common string. This means that for each j>i S[1...j] is not a common string and we discard the
            second half of the search space.
        (2) S[1...mid] is common string. This means that for for each i<j S[1...j] is a common string and we discard the first half
            of the search space, because we try to find longer common prefix.

    Complexity Analysis
    In the worst case we have n equal strings with length m.
    (1) Time complexity: O(S·log(n)), where S is the sum of all characters in all strings.
        The algorithm makes log(n) iterations, for each of them there are S=m*n comparisons, which gives in
        total O(S·log(n)) time complexity.
    (2) Space complexity: O(1). We only used constant extra space.

    Time Complexity: 95%
    Space Complexity: 14%
     */

    /*
    Key 1: low < high
    Key 2: strs[0].substring(0, (low + high) / 2)
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }
        int low = 1;
        int high = minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle)) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    private boolean isCommonPrefix(String[] strs, int len) {
        String str1 = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(str1)) {
                return false;
            }
        }
        return true;
    }
}

