package _007;

public class Solution_Yu {
    /*
    Approach: StringBuilder Reverse
    Time Complexity: 91%
    Space Complexity: 24%
     */
    public int reverse(int x){
        try {
            int reverse = 0;
            StringBuilder temp = new StringBuilder(Integer.toString(x)).reverse();
            if (temp.indexOf("-") != -1) {
                temp.deleteCharAt(temp.length() - 1);
                reverse = -Integer.parseInt(temp.toString());
            } else {
                reverse = Integer.parseInt(temp.toString());
            }
            return reverse;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
