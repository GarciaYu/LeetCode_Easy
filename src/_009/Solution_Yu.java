package _009;

public class Solution_Yu {
    /*
    Approach: StringBuilder Reverse
    Time Complexity: 72%
    Space Complexity: 30%
     */
    public boolean isPalindrome(int x) {
        /*
        From left to right = From right to left
         */
        String temp = Integer.toString(x);
        String reverse = new StringBuilder(temp).reverse().toString();
        if (temp.equals(reverse)) {
            return true;
        }
        return false;
    }
}
