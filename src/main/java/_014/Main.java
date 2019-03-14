package _014;

/**
 * Longest Common Prefix
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * Note: All given inputs are in lowercase letters a-z.
 */
public class Main {
    public static void main(String[] args) {
        Solution_04 solution = new Solution_04();
        String[] strs = {"flower", "flow", "flight", "far", "faraway", "fare"};
        String lcp = solution.longestCommonPrefix(strs);
        System.out.println(lcp);
    }
}
