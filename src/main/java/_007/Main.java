package _007;

/**
 * Reverse Integer
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Note: Assume we are dealing with an environment which could only store integers within the 32-bit signed integer ranger:[-2^31, 2^31].
 *       For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class Main {
    public static void main(String[] args) {
        Solution_Yu solution_yu = new Solution_Yu();
        System.out.println(solution_yu.reverse(123));
    }
}
