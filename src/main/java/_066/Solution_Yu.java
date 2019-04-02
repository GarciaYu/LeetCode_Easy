package _066;


public class Solution_Yu {
    /*
    Approach
    Time Complexity: 62%
    Space Complexity: 1%
     */
    public int[] plusOne(int[] digits) {
        int[] plusOneDigits = new int[digits.length + 1];
        boolean mark = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (mark) {
                int plusOne = digits[i] + 1;
                if (plusOne < 10) {
                    digits[i] = plusOne;
                    mark = false;
                } else {
                    digits[i] = 0;
                }
            }
            plusOneDigits[i + 1] = digits[i];
        }
        if (mark) {
            plusOneDigits[0] = 1;
        } else {
            return digits;
        }
        return plusOneDigits;
    }
}
