package _007;

public class Solution_01 {
    /*
    Approach: Pop and Push Digits & Check before Overflow
    Time Complexity: 100%
    Space Complexity: 18%
     */
    public int reverse(int x){
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;   // Get the last digit of x (123 --> 3)
            x /= 10;            // Delete the last digit of x (123 --> 12)

            // Check before Overflow
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;

            rev = rev * 10 + pop;
        }
        return rev;
    }
}
