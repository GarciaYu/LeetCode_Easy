package _014;

public class Solution_03 {
    /*
    Approach: Divide and Conquer

    Intuition:
    The idea of the algorithm comes from the associative property of LCP operation.
    We notice that: LCP(S1...Sn) = LCP(LCP(S1...Sk), LCP(Sk+1...Sn)), where LCP(S1...Sn)
    is the longest common prefix in set of strings [S1...Sn], 1< k < n.

    Algorithm:
    To apply the observation above, we use divide and conquer technique, where we split the
    LCP(Si...Sj) problem into two sub-problems LCP(Si...Smid) and LCP(Smid+1...Sj), where mid is (i+j)/2.
    We use their solutions lcpLeft and lcpRight to construct the solution of the main problem LCP(Si...Sj).
    To accomplish this we compare one by one the characters of lcpLeft and lcpRight till there is no character match.
    The found common prefix of lcpLeft and lcpRight is the solution of the LCP(Si...Sj).

    Complexity Analysis:
    In the worst case we have n equal strings with length m.
    (1) Time complexity: O(S), where S is the number of all characters in the array, S = m*n --> time complexity is 2·T(n/2)+O(m).
        Therefore time complexity is O(S). In the best case the algorithm performs O(n*minLen) comparisons, where minLen is the shortest
        string of the array.
    (2) Space complexity: O(m·log(n))
        There is a memory overhead since we store recursive calls in the execution stack. There are log(n) recursive calls, each store need m space
        to store the result, so space complexity is O(m·log(n)).
     */

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        return longestCommonPrefix(strs, 0, strs.length - 1);
    }

    private String longestCommonPrefix(String[] strs, int l, int r) {
        if (l == r) {
            return strs[l];
        } else {
            int mid = (l + r) / 2;
            String lcpLeft = longestCommonPrefix(strs, l, mid);
            String lcpRight = longestCommonPrefix(strs, mid + 1, r);
            return commonPrefix(lcpLeft, lcpRight);
        }
    }

    private String commonPrefix(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return left.substring(0, i);
            }
        }
        return left.substring(0, min);
    }
}
