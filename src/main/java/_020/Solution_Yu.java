package _020;

import java.util.Stack;

public class Solution_Yu {
    /*
    Approach: Stack
    Time Complexity: 92%
    Space Complexity: 18%
     */
    public boolean isValid(String s) {
        if (s == null || s.equals("")) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        char left = stack.pop();
                        if (left != '(') {
                            return false;
                        }
                    }
                    break;
                case ']':
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        char left = stack.pop();
                        if (left != '[') {
                            return false;
                        }
                    }
                    break;
                case '}':
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        char left = stack.pop();
                        if (left != '{') {
                            return false;
                        }
                    }
                    break;
                default:
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
