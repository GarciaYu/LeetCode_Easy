package _028;

public class Solution_Yu {
    /*
    Approach
    Time Complexity: 91%
    Space Complexity: 29%
     */
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        int j = 0;
        for (int i = 0; i < (haystackChars.length - needleChars.length + 1); i++) {
            if (haystackChars[i] == needleChars[j]) {
                boolean isFind = true;
                for (j = 1; j < needleChars.length; j++) {
                    if (haystackChars[i + j] != needleChars[j]) {
                        j = 0;
                        isFind = false;
                        break;
                    }
                }
                if (isFind) {
                    return i;
                }
            }
        }
        return -1;
    }
}
