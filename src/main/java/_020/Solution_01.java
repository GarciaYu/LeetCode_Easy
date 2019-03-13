package _020;

import java.util.HashMap;
import java.util.Stack;

public class Solution_01 {
    /*
    Approach: Stack

    Complexity Analysis:
    (1) Time complexity: O(n) because we simply traverse the given string one character at a time and push and pop operations
        on a stack take O(1) time.
    (2) Space complexity: O(n) as we push all opening brackets onto the stack and in the worst case,
        we will end up pushing all the brackets onto the stack.

    Time Complexity: 92%
    Space Complexity: 9%
     */
    private HashMap<Character, Character> map;

    public Solution_01() {
        this.map = new HashMap<>();
        this.map.put(')', '(');
        this.map.put(']', '[');
        this.map.put('}', '{');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (this.map.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != this.map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
