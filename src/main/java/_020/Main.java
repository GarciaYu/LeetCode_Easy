package _020;

import _014.Solution_02;

/**
 * Valid Parentheses
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 *
 * Note that an empty string is also considered valid.
 */
public class Main {
    public static void main(String[] args) {
        Solution_Yu solution = new Solution_Yu();
        System.out.println(solution.isValid("["));
    }
}
