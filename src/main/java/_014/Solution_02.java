package _014;

public class Solution_02 {
    /*
    Approach: Vertical Scanning

    Imagine a very short string is at the end of the array. The above approach will still do
    S comparisons. One way to optimize this case is to do vertical scanning. We compare
    characters from top to bottom on the same column(same character index of the strings)
    before moving on to the next column.

    Complexity Analysis
    (1) Time complexity: O(S), where S is the sum of all characters in all strings. In the worst
        case there will be n equal string with length m and the algorithm performs S = m*n character comparisons.
        Even though the worst case is still the same as Approach Horizontal Scanning, in the best case there are at most
        n*minLen comparisons where minLen is the length of the shortest string in the array.
    (2) Space complexity: O(1). We only used constant extra space.


    Time Complexity: 95%
    Space Complexity: 10%
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
