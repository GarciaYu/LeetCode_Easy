package _014;

public class Solution_01 {
    /*
    Approach: Horizontal Scanning

    Intuition:
    For a start we will describe a simple way of finding the longest prefix shared by a set of strings LCP(S1...Sn).
    We will use the observation that:
    LCP(S1...Sn) = LCP(LCP(LCP(S1,S2),S3),...Sn)

    Algorithm
    To employ this idea, the algorithm iterates through the strings[S1...Sn], finding at each iteration i the longest
    common prefix of strings LCP(S1...Si). When LCP(S1...Si) is an empty string, the algorithm ends.
    Otherwise after n iterations, the algorithm returns LCP(S1...Sn).

    Complexity Analysis
    (1) Time complexity: O(S), where S is the sum of all characters in all strings.(<<<<<<???)
        In the worst case all n strings are the same. The algorithm compares the string S1 with the other strings [S2...Sn].
        There are S character comparisons, where S is the sum of all characters in the input array.
    (2) Space complexity: O(1). We only used constant extra space.

    Time Complexity: 100%
    Space Complexity: 55%
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
