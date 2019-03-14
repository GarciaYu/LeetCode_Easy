package _009;

public class Solution_01 {
    /*
    Approach 1: Revert half of the number
    Time Complexity: 92%
    Space Complexity: 92%
     */
    public boolean isPalindrome_01(int x) {
        /*
        Special cases:
        1. when x < 0, x is not a palindrome.
        2. if the last digit of the number is 0, in order to be a palindrome,
           the first digit of the number also needs to be 0.(Only 0 satisfy this situation.)
         */
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return x == rev || x == rev / 10;
    }
}
