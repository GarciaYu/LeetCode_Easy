package _014;

public class Solution_Yu {
    /*
    Approach
    Time Complexity: 96.9%
    Space Complexity: 41%
     */
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if (strs.length == 0) {
            return prefix;
        }
        for (int i = 0; i < strs[0].length(); i++) {
            String temp = strs[0].substring(0, i + 1);
            boolean isCommon = true;
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(temp)) {
                    isCommon = false;
                    break;
                }
            }
            if (isCommon) {
                prefix = temp;
            } else {
                break;
            }
        }
        return prefix;
    }
}
